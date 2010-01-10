/**
 * Copyright 2009 http://anhquan.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.anhquan.codegen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import schemacrawler.schema.Table;

import de.anhquan.codegen.model.ClassDescriptionType;
import de.anhquan.codegen.model.ClassTableType;

public abstract class ClassGenerator {

	final static Logger log = LoggerFactory.getLogger(ClassGenerator.class);

	public static final String CLASS = "CLASS";
	public static final String CLASS_TABLE = "CLASS_TABLE";
	VelocityContext ctx;
	
	Pattern excludePattern = null;
	String excludedList;
	
	public ClassGenerator() {

		try {
			Velocity.init();
		} catch (Exception e) {
			e.printStackTrace();
		}

		ctx = new VelocityContext();
	}

	public VelocityContext getContext() {
		return ctx;
	}
	
	public void setExcludedList(String regularExp){
		this.excludedList = regularExp;
		excludePattern = Pattern.compile(regularExp);
	}
	
	public String getExcludedList(){
		return this.excludedList;
	}

	protected boolean isExcluded(Table table){
		if (excludePattern!=null){
			Matcher matcher = excludePattern.matcher(table.getName());
			if (matcher.matches()){
				return true;
			}
		}
		
		return false;
	}
	protected void generate(String template, String outputDir, String fileName, String extension)
			throws IOException {

		File dir = new File(outputDir);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		String filePath = outputDir + fileName + extension;
		FileWriter writer = new FileWriter(filePath);
		generate(template, writer);
		writer.close();

		log.info("New file '" + filePath + "' has been genereated!");
	}

	protected void generate(String template, Writer writer) {
		Template t;
		try {
			t = Velocity.getTemplate(template);
			t.merge(ctx, writer);
		} catch (ResourceNotFoundException e) {
			log.error(e.getMessage());
		} catch (ParseErrorException e) {
			log.error(e.getMessage());
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	protected void generate(ClassTableType tbl){
		if (tbl == null) 
			throw new IllegalArgumentException("ClassTableType cannot be NULL");
		
		List<ClassDescriptionType> classes = tbl.getClassDescriptions();

		String targetDir = tbl.getTargetDirectory();

		for (ClassDescriptionType cls : classes) {
			ctx.put(CLASS, cls);
			ctx.put(CLASS_TABLE, tbl);

			String template = cls.getTemplate();
			if (template == null) {
				log.warn("Template to generate class "+cls.getName()+" has not been found. SKIP IT");
				continue;
			}
			String className = cls.getName();
			if (!StringUtils.isEmpty(className)) {
				log.info("Generating class '" + cls.getName()+"'");
				String packageName = cls.getPackage();

				String targetPackageDir = StringUtils.replaceChars(
						packageName, ".", "/");
				String path = targetDir + "/" + targetPackageDir
						+ "/";

				try {
					generate(template, path, className,".java");
				} catch (IOException e) {
					log.error(e.getMessage());
				}
			}
			
		}
	}

	public abstract void generate() throws IOException;
	
	
}
