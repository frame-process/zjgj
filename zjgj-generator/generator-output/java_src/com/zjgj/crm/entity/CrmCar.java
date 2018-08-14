package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 客户车辆
 * 
 * @author liuguangsheng
 */
public class CrmCar extends BaseEntity {
	
	/*
	 * @comment 车辆ID
	 */
	private java.lang.Long carId;
	/*
	 * @comment 客户ID
	 */
	private java.lang.Long cusId;
	/*
	 * @comment 被保险人
	 */
	private java.lang.String carIns;
	/*
	 * @comment 车牌号
	 */
	private java.lang.String carNo;
	/*
	 * @comment 车型
	 */
	private java.lang.String carModel;
	/*
	 * @comment 登记日期
	 */
	private java.util.Date carRegDate;
	/*
	 * @comment 品牌
	 */
	private java.lang.String carBrand;
	/*
	 * @comment 车架号
	 */
	private java.lang.String carFrame;
	/*
	 * @comment 发动机号
	 */
	private java.lang.String carEngine;
	/*
	 * @comment 创建时间
	 */
	private java.util.Date creTime;
	/*
	 * @comment 更新时间
	 */
	private java.util.Date uptTime;
	
	public void setCarId(java.lang.Long value) {
		this.carId = value;
	}
	
	public java.lang.Long getCarId() {
		return this.carId;
	}
	public void setCusId(java.lang.Long value) {
		this.cusId = value;
	}
	
	public java.lang.Long getCusId() {
		return this.cusId;
	}
	public void setCarIns(java.lang.String value) {
		this.carIns = value;
	}
	
	public java.lang.String getCarIns() {
		return this.carIns;
	}
	public void setCarNo(java.lang.String value) {
		this.carNo = value;
	}
	
	public java.lang.String getCarNo() {
		return this.carNo;
	}
	public void setCarModel(java.lang.String value) {
		this.carModel = value;
	}
	
	public java.lang.String getCarModel() {
		return this.carModel;
	}
	public void setCarRegDate(java.util.Date value) {
		this.carRegDate = value;
	}
	
	public java.util.Date getCarRegDate() {
		return this.carRegDate;
	}
	public void setCarBrand(java.lang.String value) {
		this.carBrand = value;
	}
	
	public java.lang.String getCarBrand() {
		return this.carBrand;
	}
	public void setCarFrame(java.lang.String value) {
		this.carFrame = value;
	}
	
	public java.lang.String getCarFrame() {
		return this.carFrame;
	}
	public void setCarEngine(java.lang.String value) {
		this.carEngine = value;
	}
	
	public java.lang.String getCarEngine() {
		return this.carEngine;
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
