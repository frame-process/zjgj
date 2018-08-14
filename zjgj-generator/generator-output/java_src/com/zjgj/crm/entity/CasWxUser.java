package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 微信用户信息
 * 
 * @author liuguangsheng
 */
public class CasWxUser extends BaseEntity {
	
	/*
	 * @comment 微信标识
	 */
	private java.lang.String openId;
	/*
	 * @comment 用户标识
	 */
	private java.lang.Long userId;
	
	public void setOpenId(java.lang.String value) {
		this.openId = value;
	}
	
	public java.lang.String getOpenId() {
		return this.openId;
	}
	public void setUserId(java.lang.Long value) {
		this.userId = value;
	}
	
	public java.lang.Long getUserId() {
		return this.userId;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
