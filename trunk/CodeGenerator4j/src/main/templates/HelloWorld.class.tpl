package ${CLASS.getPackage()};
/**
 * ${CLASS_TABLE.getLicense()}
 * 
 * @author  ${CLASS_TABLE.getAuthor()}
 */

import com.sachvietonline.core.entity.${CLASS.getName()};

import de.anhquan.persistent.dao.AbstractDao;

public class ${CLASS.getName()}Dao extends AbstractDao< ${CLASS.getName()},  ${CLASS.getPrimaryKeyType()}> {

	@Override
	protected Class<${CLASS.getName()}> getEntityClass() {
		return ${CLASS.getName()}.class;
	}

}
