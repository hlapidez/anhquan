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
import java.io.IOException;

import de.anhquan.codegen.XMLClassGenerator;

public class CodeGen4j {

	public static void main(String[] args){
		if (args.length == 1){
			XMLClassGenerator gen = new XMLClassGenerator();
			gen.setClassDefinitionFile(args[0]);
			try {
				gen.generate();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else{
			System.out.println("CodeGenerator4j\n\tSyntax: java CodeGen4j <path/to/model.xml>");
		}
	}

}
