<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import ${basepackage}.entity.${className};
import ${basepackage}.service.base.BaseService;

/**
 * ${table.tableAlias}Service
 * @author wukong
 */
public interface ${className}Service extends BaseService<${className},${table.idColumn.javaType}>{

		
}
