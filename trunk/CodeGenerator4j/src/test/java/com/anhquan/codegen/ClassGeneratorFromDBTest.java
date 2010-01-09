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
package com.anhquan.codegen;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

import de.anhquan.codegen.DBClassGenerator;
import de.anhquan.codegen.formatter.DaoClassDescriptiononFormatter;

public class ClassGeneratorFromDBTest {

	@Test
	public void testGenFromXml() throws IOException{
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		LocalSessionFactoryBean sfb = (LocalSessionFactoryBean) context.getBean("&mySessionFactory");
        
		DaoClassDescriptiononFormatter formatter = new DaoClassDescriptiononFormatter("src/main/templates/HelloWorld.class.tpl","com.sachvietonline.core.entity");
		DBClassGenerator gen = (DBClassGenerator) context.getBean("dbClassGenerator");
		gen.setLocalSessionFactoryBean(sfb);
		
		gen.setSchemaName("sachvietonline");
		gen.setClassDescriptionFormatter(formatter);
		gen.setAuthor("Anh Quan");
		gen.setLicense("Apache 2.0");
		gen.setTargetDirectory("src/main/java");
		gen.generate();
	}
}
