CodeGenerator4j - Java Code Generator from XML

1. Overview
CodeGenerator4j is a Java tool to generate Java source codes from XML data.
Apache Velocity is used to generate Java codes from class definition data defined in XML files.

2. Usages
* STEP 1: Create a class definition XML file from the schema ClassSchema.xsd (located at src/main/schemas/). Look at the src/main/models/DemoClass.xml as an example.
* STEP 2: Create class templates using the following template variables:

		${CLASS.getTemplate()}
		${CLASS.getName()}
		${CLASS.getPackage()}
		
		${CLASS_TABLE.getAuthor()}
		${CLASS_TABLE.getLicense()}
		${CLASS_TABLE.getTargetDirectory()}
		
Please find the sample template at src/main/models/DemoClass.xml/HelloWorld.class.tpl

* STEP 3: Execute the ClassGenerator.
	Syntax:
		java CodeGen4j <path/to/model.xml>
		
If there is no error, you will see generated Java source codes in the output package defined in Step 1