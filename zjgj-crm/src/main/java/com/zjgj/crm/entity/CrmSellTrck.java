package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 销售跟踪数据
 * 
 * @author liuguangsheng
 */
public class CrmSellTrck extends BaseEntity {
	
	/*
	 * @comment 销售跟踪ID
	 */
	private java.lang.Long sellTrckId;
	/*
	 * @comment 销售车辆ID
	 */
	private java.lang.Long sellCarId;
	/*
	 * @comment 车辆ID
	 */
	private java.lang.Long carId;
	/*
	 * @comment 保险公司
	 */
	private java.lang.String insCom;
	/*
	 * @comment 保险人
	 */
	private java.lang.String insPpl;
	/*
	 * @comment 上个保险公司
	 */
	private java.lang.String insComPre;
	/*
	 * @comment 跟踪用户
	 */
	private java.lang.Long trckUser;
	/*
	 * @comment 跟踪人
	 */
	private java.lang.String trckName;
	/*
	 * @comment 数据类型
	 */
	private Integer dataType;
	/*
	 * @comment 数据状态
	 */
	private Integer dataStat;
	/*
	 * @comment 跟踪状态
	 */
	private Integer trckStat;
	/*
	 * @comment 跟踪备注
	 */
	private java.lang.String trckNote;
	/*
	 * @comment 数据来源
	 */
	private Integer dataSrc;
	/*
	 * @comment 客户等级
	 */
	private Integer cusGrade;
	/*
	 * @comment 预约时间
	 */
	private java.util.Date reseTime;
	/*
	 * @comment 销售预约
	 */
	private Integer sellRese;
	/*
	 * @comment 是否算单
	 */
	private Integer calcStat;
	/*
	 * @comment 算单时间
	 */
	private java.util.Date calcTime;
	/*
	 * @comment 创建时间
	 */
	private java.util.Date creTime;
	/*
	 * @comment 更新时间
	 */
	private java.util.Date uptTime;
	
	public void setSellTrckId(java.lang.Long value) {
		this.sellTrckId = value;
	}
	
	public java.lang.Long getSellTrckId() {
		return this.sellTrckId;
	}
	public void setSellCarId(java.lang.Long value) {
		this.sellCarId = value;
	}
	
	public java.lang.Long getSellCarId() {
		return this.sellCarId;
	}
	public void setCarId(java.lang.Long value) {
		this.carId = value;
	}
	
	public java.lang.Long getCarId() {
		return this.carId;
	}
	public void setInsCom(java.lang.String value) {
		this.insCom = value;
	}
	
	public java.lang.String getInsCom() {
		return this.insCom;
	}
	public void setInsPpl(java.lang.String value) {
		this.insPpl = value;
	}
	
	public java.lang.String getInsPpl() {
		return this.insPpl;
	}
	public void setInsComPre(java.lang.String value) {
		this.insComPre = value;
	}
	
	public java.lang.String getInsComPre() {
		return this.insComPre;
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
	public void setDataType(Integer value) {
		this.dataType = value;
	}
	
	public Integer getDataType() {
		return this.dataType;
	}
	public void setDataStat(Integer value) {
		this.dataStat = value;
	}
	
	public Integer getDataStat() {
		return this.dataStat;
	}
	public void setTrckStat(Integer value) {
		this.trckStat = value;
	}
	
	public Integer getTrckStat() {
		return this.trckStat;
	}
	public void setTrckNote(java.lang.String value) {
		this.trckNote = value;
	}
	
	public java.lang.String getTrckNote() {
		return this.trckNote;
	}
	public void setDataSrc(Integer value) {
		this.dataSrc = value;
	}
	
	public Integer getDataSrc() {
		return this.dataSrc;
	}
	public void setCusGrade(Integer value) {
		this.cusGrade = value;
	}
	
	public Integer getCusGrade() {
		return this.cusGrade;
	}
	public void setReseTime(java.util.Date value) {
		this.reseTime = value;
	}
	
	public java.util.Date getReseTime() {
		return this.reseTime;
	}
	public void setSellRese(Integer value) {
		this.sellRese = value;
	}
	
	public Integer getSellRese() {
		return this.sellRese;
	}
	public void setCalcStat(Integer value) {
		this.calcStat = value;
	}
	
	public Integer getCalcStat() {
		return this.calcStat;
	}
	public void setCalcTime(java.util.Date value) {
		this.calcTime = value;
	}
	
	public java.util.Date getCalcTime() {
		return this.calcTime;
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
