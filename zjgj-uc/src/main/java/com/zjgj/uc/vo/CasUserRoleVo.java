package com.zjgj.uc.vo;

/**
 * @comment 用户角色表
 * 
 * @author liuguangsheng
 */
public class CasUserRoleVo {
	
	/*
	 * @comment 用户Id
	 */
	private java.lang.Long userId;
	/*
	 * @comment 角色ID
	 */
	private java.lang.Integer roleId;
	
	public void setUserId(java.lang.Long value) {
		this.userId = value;
	}
	
	public java.lang.Long getUserId() {
		return this.userId;
	}
	public void setRoleId(java.lang.Integer value) {
		this.roleId = value;
	}
	
	public java.lang.Integer getRoleId() {
		return this.roleId;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
