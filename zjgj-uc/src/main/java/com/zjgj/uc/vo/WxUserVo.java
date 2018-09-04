package com.zjgj.uc.vo;

/**
 * @comment 微信用户信息
 * 
 * @author liuguangsheng
 */
public class WxUserVo {
	
	/*
	 * @comment 微信标识
	 */
	private java.lang.String openId;
	/*
	 * @comment 昵称
	 */
	private java.lang.String nickname;
	/*
	 * @comment 性别
	 */
	private Integer sex;
	/*
	 * @comment 语言
	 */
	private java.lang.String language;
	/*
	 * @comment 城市
	 */
	private java.lang.String city;
	/*
	 * @comment 省份
	 */
	private java.lang.String province;
	/*
	 * @comment 国家
	 */
	private java.lang.String country;
	/*
	 * @comment 头像
	 */
	private java.lang.String headimg;
	/*
	 * @comment 权限
	 */
	private java.lang.String privilege;
	/*
	 * @comment 创建时间
	 */
	private java.util.Date creTime;
	/*
	 * @comment 更新时间
	 */
	private java.util.Date uptTime;
	
	public void setOpenId(java.lang.String value) {
		this.openId = value;
	}
	
	public java.lang.String getOpenId() {
		return this.openId;
	}
	public void setNickname(java.lang.String value) {
		this.nickname = value;
	}
	
	public java.lang.String getNickname() {
		return this.nickname;
	}
	public void setSex(Integer value) {
		this.sex = value;
	}
	
	public Integer getSex() {
		return this.sex;
	}
	public void setLanguage(java.lang.String value) {
		this.language = value;
	}
	
	public java.lang.String getLanguage() {
		return this.language;
	}
	public void setCity(java.lang.String value) {
		this.city = value;
	}
	
	public java.lang.String getCity() {
		return this.city;
	}
	public void setProvince(java.lang.String value) {
		this.province = value;
	}
	
	public java.lang.String getProvince() {
		return this.province;
	}
	public void setCountry(java.lang.String value) {
		this.country = value;
	}
	
	public java.lang.String getCountry() {
		return this.country;
	}
	public void setHeadimg(java.lang.String value) {
		this.headimg = value;
	}
	
	public java.lang.String getHeadimg() {
		return this.headimg;
	}
	public void setPrivilege(java.lang.String value) {
		this.privilege = value;
	}
	
	public java.lang.String getPrivilege() {
		return this.privilege;
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
