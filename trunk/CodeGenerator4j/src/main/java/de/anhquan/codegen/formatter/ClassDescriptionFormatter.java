package de.anhquan.codegen.formatter;

import schemacrawler.schema.Table;
import de.anhquan.codegen.model.ClassDescriptionType;

public interface ClassDescriptionFormatter {

	ClassDescriptionType format(Table table);
	
}
