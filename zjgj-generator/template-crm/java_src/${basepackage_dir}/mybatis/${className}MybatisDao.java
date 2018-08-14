<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.mybatis;

<#include "/java_imports.include">

import com.zjgj.crm.entity.${className};
import com.zjgj.crm.mybatis.base.BaseDao;

/**
 * dsc ${table.tableAlias}Dao
 * @author liuguangsheng
 */
public interface ${className}MybatisDao extends BaseDao<${className},${table.idColumn.javaType}>{
	

}
