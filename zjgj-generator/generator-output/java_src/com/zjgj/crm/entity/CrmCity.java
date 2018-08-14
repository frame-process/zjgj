package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment CRM-城市信息
 * 
 * @author liuguangsheng
 */
public class CrmCity extends BaseEntity {
	
	/*
	 * @comment 城市Id
	 */
	private java.lang.Integer cityId;
	/*
	 * @comment 城市编码
	 */
	private java.lang.String cityCode;
	/*
	 * @comment 名称
	 */
	private java.lang.String cityName;
	/*
	 * @comment 上级
	 */
	private java.lang.Integer cityParent;
	/*
	 * @comment 城市级别
	 */
	private Integer cityLevel;
	/*
	 * @comment 描述
	 */
	private java.lang.String cityDsc;
	/*
	 * @comment 状态
	 */
	private Integer cityStat;
	/*
	 * @comment 短名称
	 */
	private java.lang.String shtName;
	/*
	 * @comment 合并名称
	 */
	private java.lang.String mergeName;
	/*
	 * @comment 邮编
	 */
	private java.lang.String zipCode;
	/*
	 * @comment 经度
	 */
	private BigDecimal cityLng;
	/*
	 * @comment 维度
	 */
	private BigDecimal cityLat;
	/*
	 * @comment 拼音
	 */
	private java.lang.String pinyin;
	
	public void setCityId(java.lang.Integer value) {
		this.cityId = value;
	}
	
	public java.lang.Integer getCityId() {
		return this.cityId;
	}
	public void setCityCode(java.lang.String value) {
		this.cityCode = value;
	}
	
	public java.lang.String getCityCode() {
		return this.cityCode;
	}
	public void setCityName(java.lang.String value) {
		this.cityName = value;
	}
	
	public java.lang.String getCityName() {
		return this.cityName;
	}
	public void setCityParent(java.lang.Integer value) {
		this.cityParent = value;
	}
	
	public java.lang.Integer getCityParent() {
		return this.cityParent;
	}
	public void setCityLevel(Integer value) {
		this.cityLevel = value;
	}
	
	public Integer getCityLevel() {
		return this.cityLevel;
	}
	public void setCityDsc(java.lang.String value) {
		this.cityDsc = value;
	}
	
	public java.lang.String getCityDsc() {
		return this.cityDsc;
	}
	public void setCityStat(Integer value) {
		this.cityStat = value;
	}
	
	public Integer getCityStat() {
		return this.cityStat;
	}
	public void setShtName(java.lang.String value) {
		this.shtName = value;
	}
	
	public java.lang.String getShtName() {
		return this.shtName;
	}
	public void setMergeName(java.lang.String value) {
		this.mergeName = value;
	}
	
	public java.lang.String getMergeName() {
		return this.mergeName;
	}
	public void setZipCode(java.lang.String value) {
		this.zipCode = value;
	}
	
	public java.lang.String getZipCode() {
		return this.zipCode;
	}
	public void setCityLng(BigDecimal value) {
		this.cityLng = value;
	}
	
	public BigDecimal getCityLng() {
		return this.cityLng;
	}
	public void setCityLat(BigDecimal value) {
		this.cityLat = value;
	}
	
	public BigDecimal getCityLat() {
		return this.cityLat;
	}
	public void setPinyin(java.lang.String value) {
		this.pinyin = value;
	}
	
	public java.lang.String getPinyin() {
		return this.pinyin;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
