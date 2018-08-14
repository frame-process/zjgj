package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 车辆信息变更记录
 * 
 * @author liuguangsheng
 */
public class CrmCarChange extends BaseEntity {
	
	/*
	 * @comment 车辆变更ID
	 */
	private java.lang.Long carChgId;
	/*
	 * @comment 车辆ID
	 */
	private java.lang.Long carId;
	/*
	 * @comment 变更服务
	 */
	private java.lang.String chgServ;
	/*
	 * @comment 变更前
	 */
	private java.lang.String chgBef;
	/*
	 * @comment 变更后
	 */
	private java.lang.String chgAft;
	/*
	 * @comment 变更时间
	 */
	private java.util.Date chgTime;
	/*
	 * @comment 变更用户
	 */
	private java.lang.Long chgUser;
	/*
	 * @comment 变更人
	 */
	private java.lang.String chgName;
	/*
	 * @comment 变更IP
	 */
	private java.lang.Long chgIp;
	
	public void setCarChgId(java.lang.Long value) {
		this.carChgId = value;
	}
	
	public java.lang.Long getCarChgId() {
		return this.carChgId;
	}
	public void setCarId(java.lang.Long value) {
		this.carId = value;
	}
	
	public java.lang.Long getCarId() {
		return this.carId;
	}
	public void setChgServ(java.lang.String value) {
		this.chgServ = value;
	}
	
	public java.lang.String getChgServ() {
		return this.chgServ;
	}
	public void setChgBef(java.lang.String value) {
		this.chgBef = value;
	}
	
	public java.lang.String getChgBef() {
		return this.chgBef;
	}
	public void setChgAft(java.lang.String value) {
		this.chgAft = value;
	}
	
	public java.lang.String getChgAft() {
		return this.chgAft;
	}
	public void setChgTime(java.util.Date value) {
		this.chgTime = value;
	}
	
	public java.util.Date getChgTime() {
		return this.chgTime;
	}
	public void setChgUser(java.lang.Long value) {
		this.chgUser = value;
	}
	
	public java.lang.Long getChgUser() {
		return this.chgUser;
	}
	public void setChgName(java.lang.String value) {
		this.chgName = value;
	}
	
	public java.lang.String getChgName() {
		return this.chgName;
	}
	public void setChgIp(java.lang.Long value) {
		this.chgIp = value;
	}
	
	public java.lang.Long getChgIp() {
		return this.chgIp;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
