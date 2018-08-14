package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 客户信息变更记录
 * 
 * @author liuguangsheng
 */
public class CrmCustomerChange extends BaseEntity {
	
	/*
	 * @comment 客户变更ID
	 */
	private java.lang.Long cusChgId;
	/*
	 * @comment 客户ID
	 */
	private java.lang.Long cusId;
	/*
	 * @comment 变更描述
	 */
	private java.lang.String chgDsc;
	/*
	 * @comment 变更前内容共
	 */
	private java.lang.String chgBef;
	/*
	 * @comment 变更后内容
	 */
	private java.lang.String chgAft;
	/*
	 * @comment 变更时间
	 */
	private java.util.Date chgTime;
	/*
	 * @comment 操作用户
	 */
	private java.lang.Long chgUser;
	/*
	 * @comment 操作人
	 */
	private java.lang.String chgName;
	/*
	 * @comment 变更IP地址
	 */
	private java.lang.Long chgIp;
	
	public void setCusChgId(java.lang.Long value) {
		this.cusChgId = value;
	}
	
	public java.lang.Long getCusChgId() {
		return this.cusChgId;
	}
	public void setCusId(java.lang.Long value) {
		this.cusId = value;
	}
	
	public java.lang.Long getCusId() {
		return this.cusId;
	}
	public void setChgDsc(java.lang.String value) {
		this.chgDsc = value;
	}
	
	public java.lang.String getChgDsc() {
		return this.chgDsc;
	}
	public void setChgBef(java.lang.String value) {
		this.chgBef = value;
	}
	
	public java.lang.String getChgBef() {
		return this.chgBef;
	}
	public void setChgAft(java.lang.String value) {
		this.chgAft = value;
	}
	
	public java.lang.String getChgAft() {
		return this.chgAft;
	}
	public void setChgTime(java.util.Date value) {
		this.chgTime = value;
	}
	
	public java.util.Date getChgTime() {
		return this.chgTime;
	}
	public void setChgUser(java.lang.Long value) {
		this.chgUser = value;
	}
	
	public java.lang.Long getChgUser() {
		return this.chgUser;
	}
	public void setChgName(java.lang.String value) {
		this.chgName = value;
	}
	
	public java.lang.String getChgName() {
		return this.chgName;
	}
	public void setChgIp(java.lang.Long value) {
		this.chgIp = value;
	}
	
	public java.lang.Long getChgIp() {
		return this.chgIp;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
