package com.zjgj.crm.entity;

import java.math.BigDecimal;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 理赔保单
 * 
 * @author liuguangsheng
 */
public class CrmClaimPolicy extends BaseEntity {
	
	/*
	 * @comment 理赔保单ID
	 */
	private java.lang.Long claimPolicyId;
	/*
	 * @comment 理赔跟踪ID
	 */
	private java.lang.Long claimTrckId;
	/*
	 * @comment 跟踪用户
	 */
	private java.lang.Long trckUser;
	/*
	 * @comment 跟踪人
	 */
	private java.lang.String trckName;
	/*
	 * @comment 车辆ID
	 */
	private java.lang.Long carId;
	/*
	 * @comment 交强日期
	 */
	private java.util.Date stroDate;
	/*
	 * @comment 商业日期
	 */
	private java.util.Date busiDate;
	/*
	 * @comment 保单备注
	 */
	private java.util.Date policyNote;
	/*
	 * @comment 保单状态
	 */
	private Integer policyStat;
	/*
	 * @comment 保险金额
	 */
	private BigDecimal insAmt;
	/*
	 * @comment 保单金额
	 */
	private BigDecimal policyAmt;
	/*
	 * @comment 保单实际金额
	 */
	private BigDecimal policyRealAmt;
	/*
	 * @comment 发票抬头
	 */
	private java.lang.String invoice;
	/*
	 * @comment 临时地址
	 */
	private java.lang.String tmpAddr;
	/*
	 * @comment 付款方式
	 */
	private Integer payType;
	/*
	 * @comment 礼品分组信息
	 */
	private java.lang.Integer giftGroupId;
	/*
	 * @comment 礼品数据
	 */
	private java.lang.String giftData;
	/*
	 * @comment 店铺ID
	 */
	private java.lang.Integer shopId;
	/*
	 * @comment 创建时间
	 */
	private java.util.Date creTime;
	/*
	 * @comment 更新时间
	 */
	private java.util.Date updTime;
	
	public void setClaimPolicyId(java.lang.Long value) {
		this.claimPolicyId = value;
	}
	
	public java.lang.Long getClaimPolicyId() {
		return this.claimPolicyId;
	}
	public void setClaimTrckId(java.lang.Long value) {
		this.claimTrckId = value;
	}
	
	public java.lang.Long getClaimTrckId() {
		return this.claimTrckId;
	}
	public void setTrckUser(java.lang.Long value) {
		this.trckUser = value;
	}
	
	public java.lang.Long getTrckUser() {
		return this.trckUser;
	}
	public void setTrckName(java.lang.String value) {
		this.trckName = value;
	}
	
	public java.lang.String getTrckName() {
		return this.trckName;
	}
	public void setCarId(java.lang.Long value) {
		this.carId = value;
	}
	
	public java.lang.Long getCarId() {
		return this.carId;
	}
	public void setStroDate(java.util.Date value) {
		this.stroDate = value;
	}
	
	public java.util.Date getStroDate() {
		return this.stroDate;
	}
	public void setBusiDate(java.util.Date value) {
		this.busiDate = value;
	}
	
	public java.util.Date getBusiDate() {
		return this.busiDate;
	}
	public void setPolicyNote(java.util.Date value) {
		this.policyNote = value;
	}
	
	public java.util.Date getPolicyNote() {
		return this.policyNote;
	}
	public void setPolicyStat(Integer value) {
		this.policyStat = value;
	}
	
	public Integer getPolicyStat() {
		return this.policyStat;
	}
	public void setInsAmt(BigDecimal value) {
		this.insAmt = value;
	}
	
	public BigDecimal getInsAmt() {
		return this.insAmt;
	}
	public void setPolicyAmt(BigDecimal value) {
		this.policyAmt = value;
	}
	
	public BigDecimal getPolicyAmt() {
		return this.policyAmt;
	}
	public void setPolicyRealAmt(BigDecimal value) {
		this.policyRealAmt = value;
	}
	
	public BigDecimal getPolicyRealAmt() {
		return this.policyRealAmt;
	}
	public void setInvoice(java.lang.String value) {
		this.invoice = value;
	}
	
	public java.lang.String getInvoice() {
		return this.invoice;
	}
	public void setTmpAddr(java.lang.String value) {
		this.tmpAddr = value;
	}
	
	public java.lang.String getTmpAddr() {
		return this.tmpAddr;
	}
	public void setPayType(Integer value) {
		this.payType = value;
	}
	
	public Integer getPayType() {
		return this.payType;
	}
	public void setGiftGroupId(java.lang.Integer value) {
		this.giftGroupId = value;
	}
	
	public java.lang.Integer getGiftGroupId() {
		return this.giftGroupId;
	}
	public void setGiftData(java.lang.String value) {
		this.giftData = value;
	}
	
	public java.lang.String getGiftData() {
		return this.giftData;
	}
	public void setShopId(java.lang.Integer value) {
		this.shopId = value;
	}
	
	public java.lang.Integer getShopId() {
		return this.shopId;
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
