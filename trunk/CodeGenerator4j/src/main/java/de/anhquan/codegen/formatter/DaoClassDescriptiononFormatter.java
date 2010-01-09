package de.anhquan.codegen.formatter;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import schemacrawler.schema.IndexColumn;
import schemacrawler.schema.PrimaryKey;
import schemacrawler.schema.Table;
import de.anhquan.codegen.model.ClassDescriptionType;

public class DaoClassDescriptiononFormatter implements ClassDescriptionFormatter {

	final static Logger log = LoggerFactory.getLogger(DaoClassDescriptiononFormatter.class);
	
	private String classTemplate;
	private String targetPackage;

	public DaoClassDescriptiononFormatter(String classTemplate, String targetPackage){
		this.classTemplate = classTemplate;
		this.targetPackage = targetPackage;
	}
	
	public ClassDescriptionType format(Table table) {
		
		char[] delimiters = new char[]{'_'};
		String clazzName = WordUtils.capitalizeFully(table.getName(),delimiters );
		clazzName = StringUtils.remove(clazzName, '_');
		log.debug("format class : "+clazzName);
		
		String primaryKeyType = clazzName+"Pk";
		PrimaryKey pk = table.getPrimaryKey();
		if (pk!=null){
			log.debug("PKNAME = "+pk.getName());
			log.debug("type = "+pk.getType());
			log.debug("car="+pk.getCardinality());
			IndexColumn[] cols = pk.getColumns();
			if (cols.length==1){
				IndexColumn indexColumn = cols[0];
				primaryKeyType = indexColumn.getType().getTypeClassName();
			}
		}
		
		ClassDescriptionType desc = new ClassDescriptionType();
		desc.setName(clazzName);
		desc.setPackage(targetPackage);
		desc.setPrimaryKeyType(primaryKeyType);
		desc.setTemplate(classTemplate);
		return desc;
	}

}
