package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 角色信息
 * 
 * @author liuguangsheng
 */
public class CasRole extends BaseEntity {
	
	/*
	 * @comment 角色ID
	 */
	private java.lang.Integer roleId;
	/*
	 * @comment 角色名称
	 */
	private java.lang.String roleName;
	/*
	 * @comment 角色描述
	 */
	private java.lang.String roleDsc;
	/*
	 * @comment 父级角色
	 */
	private java.lang.Integer roleParent;
	/*
	 * @comment 是否启用
	 */
	private Integer roleStat;
	/*
	 * @comment 是否删除
	 */
	private Integer roleDel;
	
	public void setRoleId(java.lang.Integer value) {
		this.roleId = value;
	}
	
	public java.lang.Integer getRoleId() {
		return this.roleId;
	}
	public void setRoleName(java.lang.String value) {
		this.roleName = value;
	}
	
	public java.lang.String getRoleName() {
		return this.roleName;
	}
	public void setRoleDsc(java.lang.String value) {
		this.roleDsc = value;
	}
	
	public java.lang.String getRoleDsc() {
		return this.roleDsc;
	}
	public void setRoleParent(java.lang.Integer value) {
		this.roleParent = value;
	}
	
	public java.lang.Integer getRoleParent() {
		return this.roleParent;
	}
	public void setRoleStat(Integer value) {
		this.roleStat = value;
	}
	
	public Integer getRoleStat() {
		return this.roleStat;
	}
	public void setRoleDel(Integer value) {
		this.roleDel = value;
	}
	
	public Integer getRoleDel() {
		return this.roleDel;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
