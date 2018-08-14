<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import ${basepackage}.entity.${className};
import ${basepackage}.mybatis.${className}MybatisDao;
import ${basepackage}.mybatis.base.BaseDao;
import ${basepackage}.service.${className}Service;
import ${basepackage}.service.base.impl.BaseServiceImpl;

<#include "/java_imports.include">
/**
 * ${table.tableAlias}Service实现类
 * @author wukong
 */
@Service
public class ${className}ServiceImpl extends BaseServiceImpl<${className},${table.idColumn.javaType}> implements ${className}Service{
	
	@Resource
	private ${className}MybatisDao ${classNameLower}MybatisDao;

	@Override
	protected BaseDao<${className}, ${table.idColumn.javaType}> getDao() {
		return ${classNameLower}MybatisDao;
	}
	
}
