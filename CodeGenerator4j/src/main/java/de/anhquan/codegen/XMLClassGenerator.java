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
import java.io.IOException;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.anhquan.codegen.model.ClassTableType;
import de.anhquan.codegen.util.JAXBPool;

public class XMLClassGenerator extends ClassGenerator{

	final static Logger log = LoggerFactory.getLogger(XMLClassGenerator.class);

	String classDefinitionFile;

	public void setClassDefinitionFile(String classDefinitionFile) {
		this.classDefinitionFile = classDefinitionFile;
	}

	@Override
	public void generate()  throws IOException {
		File f = new File(classDefinitionFile);

		javax.xml.bind.Unmarshaller unmarshaller = JAXBPool.JAXB_UNMARSHALLER;
		try {
			@SuppressWarnings("unchecked")
			JAXBElement<ClassTableType> rootElement = (JAXBElement<ClassTableType>) unmarshaller
					.unmarshal(f);
			ClassTableType tbl = rootElement.getValue();
			
			generate(tbl);

		} catch (JAXBException e) {
			log.error(e.getMessage());
		} catch (IllegalArgumentException e){
			log.error(e.getMessage());
		}
	}
}
