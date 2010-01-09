package ${CLASS.getPackage()};

import com.sachvietonline.core.entity.${CLASS.getEntityClass()};

import de.anhquan.persistent.dao.AbstractDao;

public class ${CLASS.getName()} extends AbstractDao< ${CLASS.getEntityClass()},  ${CLASS.getPrimaryKeyType()}> {

	@Override
	protected Class<${CLASS.getEntityClass()}> getEntityClass() {
		return ${CLASS.getEntityClass()}.class;
	}

}
