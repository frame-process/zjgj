package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 保单险种信息
 * 
 * @author liuguangsheng
 */
public class CrmSellInsurance extends BaseEntity {
	
	/*
	 * @comment 销售保单ID
	 */
	private java.lang.Long sellPolicyId;
	/*
	 * @comment 车辆ID
	 */
	private java.lang.Integer insId;
	/*
	 * @comment 选择值
	 */
	private java.lang.String selVal;
	/*
	 * @comment 文本值
	 */
	private java.lang.String txtVal;
	
	public void setSellPolicyId(java.lang.Long value) {
		this.sellPolicyId = value;
	}
	
	public java.lang.Long getSellPolicyId() {
		return this.sellPolicyId;
	}
	public void setInsId(java.lang.Integer value) {
		this.insId = value;
	}
	
	public java.lang.Integer getInsId() {
		return this.insId;
	}
	public void setSelVal(java.lang.String value) {
		this.selVal = value;
	}
	
	public java.lang.String getSelVal() {
		return this.selVal;
	}
	public void setTxtVal(java.lang.String value) {
		this.txtVal = value;
	}
	
	public java.lang.String getTxtVal() {
		return this.txtVal;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
