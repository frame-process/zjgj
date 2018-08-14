package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 修理厂
 * 
 * @author liuguangsheng
 */
public class CrmRepairShop extends BaseEntity {
	
	/*
	 * @comment 修理厂ID
	 */
	private java.lang.Integer shopId;
	/*
	 * @comment 修理厂名称
	 */
	private java.lang.String shopName;
	
	public void setShopId(java.lang.Integer value) {
		this.shopId = value;
	}
	
	public java.lang.Integer getShopId() {
		return this.shopId;
	}
	public void setShopName(java.lang.String value) {
		this.shopName = value;
	}
	
	public java.lang.String getShopName() {
		return this.shopName;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
