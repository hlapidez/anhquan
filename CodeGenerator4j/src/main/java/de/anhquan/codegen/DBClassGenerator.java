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

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.Dialect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

import schemacrawler.crawl.SchemaCrawler;
import schemacrawler.schema.Database;
import schemacrawler.schema.Schema;
import schemacrawler.schema.Table;
import schemacrawler.schemacrawler.SchemaCrawlerException;
import schemacrawler.schemacrawler.SchemaCrawlerOptions;
import de.anhquan.codegen.formatter.ClassDescriptionFormatter;
import de.anhquan.codegen.model.ClassDescriptionType;
import de.anhquan.codegen.model.ClassTableType;

public class DBClassGenerator extends ClassGenerator {

	final static Logger log = LoggerFactory.getLogger(DBClassGenerator.class);

	HibernateTemplate hibernateTemplate;
	SessionFactory sessionFactory;
	Configuration cfg;
	Dialect dialect;

	String schemaName;
	String targetPackage;

	private String author;

	private String license;

	private String targetDirectory;
	
	private ClassDescriptionFormatter classDescriptionFormatter;

	public void setConfigTemplate(String configTemplate) {
		this.configTemplate = configTemplate;
	}

	public void setConfigOutputDir(String configOutputDir) {
		if (!configOutputDir.endsWith("/"))
			configOutputDir=configOutputDir+"/";
		
		this.configOutputDir = configOutputDir;
	}
	public void setConfigOutputFileName(String configOutputFileName) {
		this.configOutputFileName = configOutputFileName;
	}

	private String configTemplate;

	private String configOutputDir;

	private String configOutputFileName;
	
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void setSchemaName(String targetSchema){
		this.schemaName = targetSchema;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	public void setLocalSessionFactoryBean(LocalSessionFactoryBean sfb){
		cfg = sfb.getConfiguration();
        
	}
	
	@Override
	public void generate() {
		
		try {
			ClassTableType tbl = buildClassTable();
			generate(tbl);
			generateConfigFile(tbl);
		} catch (HibernateException e) {
			log.warn("HibernateException: "+e.getMessage());
		} catch (SQLException e) {
			log.warn("SQLException: "+e.getMessage());
		}
	}
	
	private void generateConfigFile(ClassTableType tbl) {
		try {
			ctx.put(CLASS_TABLE, tbl);
			generate(configTemplate,configOutputDir,configOutputFileName,".xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private ClassTableType buildClassTable() throws HibernateException, SQLException {
		
		hibernateTemplate.setFlushMode(HibernateTemplate.FLUSH_NEVER);
		
		final ClassTableType classTable = new ClassTableType();
		classTable.setAuthor(author);
		classTable.setLicense(license);
		classTable.setTargetDirectory(targetDirectory);
		final List<ClassDescriptionType> classDescriptions = new ArrayList<ClassDescriptionType>();
		hibernateTemplate.execute(new HibernateCallback() {
			
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Connection connection = session.connection();
				SchemaCrawlerOptions options = new SchemaCrawlerOptions();
				SchemaCrawler crawler;
				try {
					crawler = new SchemaCrawler(connection);
					Database db = crawler.crawl(options);
					
					Schema schema = db.getSchema(schemaName);
					if (schema==null){
						log.warn("Could not find the schema '"+schemaName+"' in the database");
						return null;
					}
					
					Table[] tables = schema.getTables();
					for (Table table : tables) {
						
						if (isExcluded(table)){
							continue;
						}
						
						ClassDescriptionType desc = classDescriptionFormatter.format(table);
						if (desc!=null){
							
							classDescriptions.add(desc);
						}
							
					}
					
					classTable.getClassDescriptions().addAll(classDescriptions);
					
				} catch (SchemaCrawlerException e) {
					log.warn("SchemaCrawlerException: "+e.getMessage());
				}
				return null;
			}
		});
		
		return classTable;
    }

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public void setTargetDirectory(String targetDirectory) {
		this.targetDirectory = targetDirectory;
	}

	public void setClassDescriptionFormatter(ClassDescriptionFormatter classDescriptionFormatter) {
		this.classDescriptionFormatter = classDescriptionFormatter;
	}

	public ClassDescriptionFormatter getClassDescriptionFormatter() {
		return classDescriptionFormatter;
	}

}
