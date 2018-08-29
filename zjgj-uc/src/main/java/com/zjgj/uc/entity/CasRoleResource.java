package com.zjgj.uc.entity;

import com.zjgj.uc.entity.base.BaseEntity;
/**
 * @comment 角色资源
 * 
 * @author liuguangsheng
 */
public class CasRoleResource extends BaseEntity {
	
	/*
	 * @comment 角色ID
	 */
	private java.lang.Integer roleId;
	/*
	 * @comment 资源ID
	 */
	private java.lang.Integer resId;
	
	public void setRoleId(java.lang.Integer value) {
		this.roleId = value;
	}
	
	public java.lang.Integer getRoleId() {
		return this.roleId;
	}
	public void setResId(java.lang.Integer value) {
		this.resId = value;
	}
	
	public java.lang.Integer getResId() {
		return this.resId;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
