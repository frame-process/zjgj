<#assign className = table.className>
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.entity;

<#include "/java_imports.include">
import ${basepackage}.entity.base.BaseEntity;
/**
 * @comment ${table.tableAlias}
 * 
 * @author liuguangsheng
 */
public class ${className} extends BaseEntity {
	
	<#list table.columns as column>
	/*
	 * @comment ${column.columnAlias}
	 */
	private ${column.javaType} ${column.columnNameLower};
	</#list>
	
	<@generateJavaColumns/>
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
<#macro generateJavaColumns>
	<#list table.columns as column>	
	public void set${column.columnName}(${column.javaType} value) {
		this.${column.columnNameLower} = value;
	}
	
	public ${column.javaType} get${column.columnName}() {
		return this.${column.columnNameLower};
	}
	</#list>
</#macro>