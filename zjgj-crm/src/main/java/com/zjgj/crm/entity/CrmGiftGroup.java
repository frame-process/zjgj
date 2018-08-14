package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 礼品分组
 * 
 * @author liuguangsheng
 */
public class CrmGiftGroup extends BaseEntity {
	
	/*
	 * @comment 礼品分组ID
	 */
	private java.lang.Integer giftGrpId;
	/*
	 * @comment 礼品名称
	 */
	private java.lang.String grpName;
	/*
	 * @comment 礼品数据
	 */
	private java.lang.String grpData;
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
	
	public void setGiftGrpId(java.lang.Integer value) {
		this.giftGrpId = value;
	}
	
	public java.lang.Integer getGiftGrpId() {
		return this.giftGrpId;
	}
	public void setGrpName(java.lang.String value) {
		this.grpName = value;
	}
	
	public java.lang.String getGrpName() {
		return this.grpName;
	}
	public void setGrpData(java.lang.String value) {
		this.grpData = value;
	}
	
	public java.lang.String getGrpData() {
		return this.grpData;
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
