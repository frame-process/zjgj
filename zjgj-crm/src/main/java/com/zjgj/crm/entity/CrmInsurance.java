package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 保险信息-描述保险相关内容
 * 
 * @author liuguangsheng
 */
public class CrmInsurance extends BaseEntity {
	
	/*
	 * @comment 保险ID
	 */
	private java.lang.Integer insId;
	/*
	 * @comment 保险名称
	 */
	private java.lang.String insName;
	/*
	 * @comment 保险描述
	 */
	private java.lang.String insDsc;
	/*
	 * @comment 是否删除
	 */
	private Integer insDel;
	/*
	 * @comment 是否启用
	 */
	private Integer insStat;
	/*
	 * @comment 创建时间
	 */
	private java.util.Date creTime;
	
	public void setInsId(java.lang.Integer value) {
		this.insId = value;
	}
	
	public java.lang.Integer getInsId() {
		return this.insId;
	}
	public void setInsName(java.lang.String value) {
		this.insName = value;
	}
	
	public java.lang.String getInsName() {
		return this.insName;
	}
	public void setInsDsc(java.lang.String value) {
		this.insDsc = value;
	}
	
	public java.lang.String getInsDsc() {
		return this.insDsc;
	}
	public void setInsDel(Integer value) {
		this.insDel = value;
	}
	
	public Integer getInsDel() {
		return this.insDel;
	}
	public void setInsStat(Integer value) {
		this.insStat = value;
	}
	
	public Integer getInsStat() {
		return this.insStat;
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
