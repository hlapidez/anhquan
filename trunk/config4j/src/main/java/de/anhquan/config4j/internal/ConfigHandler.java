/**
 * Copyright 2009 http://anhquan.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package de.anhquan.config4j.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;

import de.anhquan.config4j.annotation.ConfigContainer;
import de.anhquan.config4j.annotation.ConfigParam;

public class ConfigHandler implements InvocationHandler {

	static final Pattern GETTER_REG = Pattern.compile("^(is|get)(.+)$");
	static final Pattern SETTER_REG = Pattern.compile("^(set)(.+)$");

	private Configuration configuration;
	private String prefix;
	private String configLocation;
	private Class<?> configType;

	public ConfigHandler(Class<?> configType) {
		this.configType = configType;
		ConfigContainer annotation = configType.getAnnotation(ConfigContainer.class);
		configLocation = annotation.Location();
		prefix = annotation.Prefix();

		try {
			configuration = new PropertiesConfiguration(configLocation);
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		String methodName = method.getName();
		
		@SuppressWarnings("unchecked")
		Class returnType = method.getReturnType();

		Matcher matcher;

		if (GETTER_REG.matcher(methodName).matches())
			return invokeGetter(proxy, method);
		else if ((matcher = SETTER_REG.matcher(methodName)).matches() && returnType.equals(void.class)) {

			String key = matcher.group(2);
			Method getter = findGetter(key, returnType);
			String propName = findPropertyName(getter);

			return invokeSetter(proxy, method, propName, args[0]);
		}

		return null;
	}

	private Method findGetter(String key, Class<?> methodType) {
		String getMethodName = "get" + key;
		Method getter = null;
		try {
			getter = configType.getMethod(getMethodName);
		} catch (NoSuchMethodException e) {
			if (Boolean.TYPE.equals(methodType)) {
				try {
					getter = configType.getMethod("is" + key);
				} catch (NoSuchMethodException ex2) {
				}
			}
		}

		return getter;
	}
	
	private Object invokeGetter(Object proxy, Method method) {
		@SuppressWarnings("unchecked")
		Class clsReturnType = method.getReturnType();

		String strReturnType = StringUtils.capitalize(ClassUtils.getShortClassName(clsReturnType));
		String configMethodName = "get" + strReturnType;
		
		String propName = findPropertyName(method);

		try {
			Method getter = Configuration.class.getMethod(configMethodName, String.class); //String.class is for propName
			return getter.invoke(configuration, propName);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			
			return findDefaultValue(method,clsReturnType);
		}
		return null;
	}

	private String findPropertyName(Method getter) {
		ConfigParam annotation = getter.getAnnotation(ConfigParam.class);
		String paramName = (annotation != null) ? prefix + annotation.PropertyName() : getter.getName();
		return paramName;
	}
	
	@SuppressWarnings("unchecked")
	private Object findDefaultValue(Method getter, Class returnType) {
		System.out.println("Find default");
		ConfigParam annotation = getter.getAnnotation(ConfigParam.class);
		Object defaultValue = null;
		if (annotation!=null){
			if (returnType.equals(Integer.class) || returnType.equals(int.class))
				defaultValue = annotation.DefaultInteger();
			else if (returnType.equals(Double.class) || returnType.equals(double.class))
				defaultValue = annotation.DefaultDouble();
			else if (returnType.equals(Float.class) || returnType.equals(float.class))
				defaultValue = annotation.DefaultFloat();
			else if (returnType.equals(Byte.class) || returnType.equals(byte.class))
				defaultValue = annotation.DefaultFloat();
			else if (returnType.equals(Character.class) || returnType.equals(char.class))
				defaultValue = annotation.DefaultChar();
			else if (returnType.equals(String.class))
				defaultValue = annotation.DefaultString();
			else if (returnType.equals(Boolean.class))
				defaultValue = annotation.DefaultBoolean();
			else if (returnType.equals(Class.class))
				defaultValue = annotation.DefaultClass();
		}
		return defaultValue;
	}

	private Object invokeSetter(Object proxy, Method method, String key, Object value) {
		configuration.setProperty(key, value);
		return null;
	}
	
}