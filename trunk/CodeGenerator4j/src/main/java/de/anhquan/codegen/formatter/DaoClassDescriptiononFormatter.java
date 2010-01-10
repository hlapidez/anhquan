package de.anhquan.codegen.formatter;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.WordUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import schemacrawler.schema.Column;
import schemacrawler.schema.ForeignKey;
import schemacrawler.schema.ForeignKeyColumnMap;
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
		String entityClassName = WordUtils.capitalizeFully(table.getName(),delimiters );
		entityClassName = StringUtils.remove(entityClassName, '_');
		String daoClassName = entityClassName+"Dao";
		log.debug("format class : "+daoClassName);
		
		String primaryKeyType = entityClassName+"PK";
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
		desc.setName(daoClassName);
		desc.setPackage(targetPackage);
		desc.setPrimaryKeyType(primaryKeyType);
		desc.setTemplate(classTemplate);
		desc.setEntityClass(entityClassName);
		
		
		log.debug("ForeignKeys of "+table.getName());
		ForeignKey[] foreignKeys = table.getForeignKeys();
		for (ForeignKey foreignKey : foreignKeys) {
			log.debug("--name = "+foreignKey.getName());
			ForeignKeyColumnMap[] paris = foreignKey.getColumnPairs();
			for (ForeignKeyColumnMap foreignKeyColumnMap : paris) {
				log.debug("----foreignKeyColumnMap = "+foreignKeyColumnMap.getName());
				Column pk1 = foreignKeyColumnMap.getPrimaryKeyColumn();
				Column fk1 = foreignKeyColumnMap.getForeignKeyColumn();
				log.debug("------ FK = "+ fk1.getParent().getName()+"."+fk1.getName());
				log.debug("------ REF TO PK = "+pk1.getParent().getName()+"."+pk1.getName());
			}
		}
		
		log.debug("ExportedForeignKeys of "+table.getName());
		ForeignKey[] exportedForeignKeys = table.getExportedForeignKeys();
		for (ForeignKey foreignKey : exportedForeignKeys) {
			log.debug("--name = "+foreignKey.getName());
			ForeignKeyColumnMap[] paris = foreignKey.getColumnPairs();
			for (ForeignKeyColumnMap foreignKeyColumnMap : paris) {
				log.debug("----foreignKeyColumnMap = "+foreignKeyColumnMap.getName());
				Column pk1 = foreignKeyColumnMap.getPrimaryKeyColumn();
				Column fk1 = foreignKeyColumnMap.getForeignKeyColumn();
				log.debug("------ FK = "+ fk1.getParent().getName()+"."+fk1.getName());
				log.debug("------ REF TO PK = "+pk1.getParent().getName()+"."+pk1.getName());
			}
		}
		
		log.debug("ImportedForeignKeys of "+table.getName());
		ForeignKey[] importedForeignKeys = table.getImportedForeignKeys();
		for (ForeignKey foreignKey : importedForeignKeys) {
			log.debug("--name = "+foreignKey.getName());
			ForeignKeyColumnMap[] paris = foreignKey.getColumnPairs();
			for (ForeignKeyColumnMap foreignKeyColumnMap : paris) {
				log.debug("----foreignKeyColumnMap = "+foreignKeyColumnMap.getName());
				Column pk1 = foreignKeyColumnMap.getPrimaryKeyColumn();
				Column fk1 = foreignKeyColumnMap.getForeignKeyColumn();
				log.debug("------ FK = "+ fk1.getParent().getName()+"."+fk1.getName());
				log.debug("------ REF TO PK = "+pk1.getParent().getName()+"."+pk1.getName());
			}
		}
		
		log.debug("-------------------------");
		return desc;
	}

}
