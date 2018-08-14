package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment CRM-节假日
 * 
 * @author liuguangsheng
 */
public class CrmHoliday extends BaseEntity {
	
	/*
	 * @comment 节假日ID
	 */
	private java.lang.Integer holId;
	/*
	 * @comment 节假日
	 */
	private java.util.Date holDate;
	/*
	 * @comment 备注
	 */
	private java.lang.String note;
	/*
	 * @comment 工作日
	 */
	private java.util.Date workDate;
	/*
	 * @comment 删除
	 */
	private Integer holDel;
	/*
	 * @comment 状态
	 */
	private Integer holStat;
	/*
	 * @comment 操作用户
	 */
	private java.lang.Long creUser;
	/*
	 * @comment 操作人
	 */
	private java.lang.String creName;
	/*
	 * @comment 操作IP
	 */
	private java.lang.Long creIp;
	/*
	 * @comment 创建时间
	 */
	private java.util.Date creTime;
	
	public void setHolId(java.lang.Integer value) {
		this.holId = value;
	}
	
	public java.lang.Integer getHolId() {
		return this.holId;
	}
	public void setHolDate(java.util.Date value) {
		this.holDate = value;
	}
	
	public java.util.Date getHolDate() {
		return this.holDate;
	}
	public void setNote(java.lang.String value) {
		this.note = value;
	}
	
	public java.lang.String getNote() {
		return this.note;
	}
	public void setWorkDate(java.util.Date value) {
		this.workDate = value;
	}
	
	public java.util.Date getWorkDate() {
		return this.workDate;
	}
	public void setHolDel(Integer value) {
		this.holDel = value;
	}
	
	public Integer getHolDel() {
		return this.holDel;
	}
	public void setHolStat(Integer value) {
		this.holStat = value;
	}
	
	public Integer getHolStat() {
		return this.holStat;
	}
	public void setCreUser(java.lang.Long value) {
		this.creUser = value;
	}
	
	public java.lang.Long getCreUser() {
		return this.creUser;
	}
	public void setCreName(java.lang.String value) {
		this.creName = value;
	}
	
	public java.lang.String getCreName() {
		return this.creName;
	}
	public void setCreIp(java.lang.Long value) {
		this.creIp = value;
	}
	
	public java.lang.Long getCreIp() {
		return this.creIp;
	}
	public void setCreTime(java.util.Date value) {
		this.creTime = value;
	}
	
	public java.util.Date getCreTime() {
		return this.creTime;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
