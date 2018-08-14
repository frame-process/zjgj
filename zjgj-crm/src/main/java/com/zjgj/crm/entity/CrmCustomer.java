package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 客户信息
 * 
 * @author liuguangsheng
 */
public class CrmCustomer extends BaseEntity {
	
	/*
	 * @comment 客户ID
	 */
	private java.lang.Long cusId;
	/*
	 * @comment 客户姓名
	 */
	private java.lang.String cusName;
	/*
	 * @comment 客户手机号
	 */
	private java.lang.String cusMobile;
	/*
	 * @comment 客户电话
	 */
	private java.lang.String cusPhone;
	/*
	 * @comment 客户地址
	 */
	private java.lang.String cusAddr;
	/*
	 * @comment 客户类型
	 */
	private Integer cusType;
	/*
	 * @comment 客户等级
	 */
	private Integer cusGrade;
	/*
	 * @comment 创建时间
	 */
	private java.util.Date creTime;
	/*
	 * @comment 更新时间
	 */
	private java.util.Date updTime;
	
	public void setCusId(java.lang.Long value) {
		this.cusId = value;
	}
	
	public java.lang.Long getCusId() {
		return this.cusId;
	}
	public void setCusName(java.lang.String value) {
		this.cusName = value;
	}
	
	public java.lang.String getCusName() {
		return this.cusName;
	}
	public void setCusMobile(java.lang.String value) {
		this.cusMobile = value;
	}
	
	public java.lang.String getCusMobile() {
		return this.cusMobile;
	}
	public void setCusPhone(java.lang.String value) {
		this.cusPhone = value;
	}
	
	public java.lang.String getCusPhone() {
		return this.cusPhone;
	}
	public void setCusAddr(java.lang.String value) {
		this.cusAddr = value;
	}
	
	public java.lang.String getCusAddr() {
		return this.cusAddr;
	}
	public void setCusType(Integer value) {
		this.cusType = value;
	}
	
	public Integer getCusType() {
		return this.cusType;
	}
	public void setCusGrade(Integer value) {
		this.cusGrade = value;
	}
	
	public Integer getCusGrade() {
		return this.cusGrade;
	}
	public void setCreTime(java.util.Date value) {
		this.creTime = value;
	}
	
	public java.util.Date getCreTime() {
		return this.creTime;
	}
	public void setUpdTime(java.util.Date value) {
		this.updTime = value;
	}
	
	public java.util.Date getUpdTime() {
		return this.updTime;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
