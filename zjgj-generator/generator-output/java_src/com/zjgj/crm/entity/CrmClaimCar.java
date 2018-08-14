package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 理赔车辆
 * 
 * @author liuguangsheng
 */
public class CrmClaimCar extends BaseEntity {
	
	/*
	 * @comment 理赔ID
	 */
	private java.lang.Long claimCarId;
	/*
	 * @comment 车辆ID
	 */
	private java.lang.Long carId;
	/*
	 * @comment 分配状态
	 */
	private Integer distStat;
	/*
	 * @comment 数据类型
	 */
	private Integer dataType;
	/*
	 * @comment 数据来源
	 */
	private Integer dataSrc;
	/*
	 * @comment 创建时间
	 */
	private java.util.Date creTime;
	/*
	 * @comment 更新时间
	 */
	private java.util.Date uptTime;
	
	public void setClaimCarId(java.lang.Long value) {
		this.claimCarId = value;
	}
	
	public java.lang.Long getClaimCarId() {
		return this.claimCarId;
	}
	public void setCarId(java.lang.Long value) {
		this.carId = value;
	}
	
	public java.lang.Long getCarId() {
		return this.carId;
	}
	public void setDistStat(Integer value) {
		this.distStat = value;
	}
	
	public Integer getDistStat() {
		return this.distStat;
	}
	public void setDataType(Integer value) {
		this.dataType = value;
	}
	
	public Integer getDataType() {
		return this.dataType;
	}
	public void setDataSrc(Integer value) {
		this.dataSrc = value;
	}
	
	public Integer getDataSrc() {
		return this.dataSrc;
	}
	public void setCreTime(java.util.Date value) {
		this.creTime = value;
	}
	
	public java.util.Date getCreTime() {
		return this.creTime;
	}
	public void setUptTime(java.util.Date value) {
		this.uptTime = value;
	}
	
	public java.util.Date getUptTime() {
		return this.uptTime;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
