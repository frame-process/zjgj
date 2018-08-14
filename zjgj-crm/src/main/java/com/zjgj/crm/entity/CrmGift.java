package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 礼品信息
 * 
 * @author liuguangsheng
 */
public class CrmGift extends BaseEntity {
	
	/*
	 * @comment 礼品ID
	 */
	private java.lang.Integer giftId;
	/*
	 * @comment 礼品名称
	 */
	private java.lang.String giftName;
	/*
	 * @comment 是否删除
	 */
	private Integer giftDel;
	/*
	 * @comment 是否可用
	 */
	private Integer giftStat;
	/*
	 * @comment 创建时间
	 */
	private java.util.Date creTime;
	
	public void setGiftId(java.lang.Integer value) {
		this.giftId = value;
	}
	
	public java.lang.Integer getGiftId() {
		return this.giftId;
	}
	public void setGiftName(java.lang.String value) {
		this.giftName = value;
	}
	
	public java.lang.String getGiftName() {
		return this.giftName;
	}
	public void setGiftDel(Integer value) {
		this.giftDel = value;
	}
	
	public Integer getGiftDel() {
		return this.giftDel;
	}
	public void setGiftStat(Integer value) {
		this.giftStat = value;
	}
	
	public Integer getGiftStat() {
		return this.giftStat;
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
