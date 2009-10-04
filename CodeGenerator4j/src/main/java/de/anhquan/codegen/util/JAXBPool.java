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
package de.anhquan.codegen.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBPool {

	public static JAXBContext JAXB_CONTEXT;
	
	public static Unmarshaller JAXB_UNMARSHALLER;
	
	public static Marshaller JAXB_MARSHALLER;
	
	static {
		
		try {
			JAXB_CONTEXT = JAXBContext.newInstance("de.anhquan.codegen.model");
			
			JAXB_UNMARSHALLER = JAXB_CONTEXT.createUnmarshaller();
			JAXB_MARSHALLER = JAXB_CONTEXT.createMarshaller();
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
