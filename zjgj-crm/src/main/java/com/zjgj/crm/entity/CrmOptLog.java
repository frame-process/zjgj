package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment CRM-操作日志
 * 
 * @author liuguangsheng
 */
public class CrmOptLog extends BaseEntity {
	
	/*
	 * @comment 操作ID
	 */
	private java.lang.Long optId;
	/*
	 * @comment 操作用户
	 */
	private java.lang.Long optUser;
	/*
	 * @comment 操作人
	 */
	private java.lang.String optName;
	/*
	 * @comment 操作时间
	 */
	private java.util.Date optTime;
	/*
	 * @comment 操作描述
	 */
	private java.lang.String optServ;
	/*
	 * @comment 操作参数
	 */
	private java.lang.String optParm;
	/*
	 * @comment 返回结果
	 */
	private java.lang.String optResult;
	
	public void setOptId(java.lang.Long value) {
		this.optId = value;
	}
	
	public java.lang.Long getOptId() {
		return this.optId;
	}
	public void setOptUser(java.lang.Long value) {
		this.optUser = value;
	}
	
	public java.lang.Long getOptUser() {
		return this.optUser;
	}
	public void setOptName(java.lang.String value) {
		this.optName = value;
	}
	
	public java.lang.String getOptName() {
		return this.optName;
	}
	public void setOptTime(java.util.Date value) {
		this.optTime = value;
	}
	
	public java.util.Date getOptTime() {
		return this.optTime;
	}
	public void setOptServ(java.lang.String value) {
		this.optServ = value;
	}
	
	public java.lang.String getOptServ() {
		return this.optServ;
	}
	public void setOptParm(java.lang.String value) {
		this.optParm = value;
	}
	
	public java.lang.String getOptParm() {
		return this.optParm;
	}
	public void setOptResult(java.lang.String value) {
		this.optResult = value;
	}
	
	public java.lang.String getOptResult() {
		return this.optResult;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
