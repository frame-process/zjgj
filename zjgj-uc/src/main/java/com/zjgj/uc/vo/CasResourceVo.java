package com.zjgj.uc.vo;

/**
 * @comment 资源信息表
 * 
 * @author liuguangsheng
 */
public class CasResourceVo {
	
	/*
	 * @comment 资源ID
	 */
	private java.lang.Integer resId;
	/*
	 * @comment 资源名称
	 */
	private java.lang.String resName;
	/*
	 * @comment 资源类型
	 */
	private Integer resType;
	/*
	 * @comment 资源URL
	 */
	private java.lang.String resUrl;
	/*
	 * @comment 资源描述
	 */
	private java.lang.String resDsc;
	/*
	 * @comment 父级资源
	 */
	private java.lang.Integer resParent;
	/*
	 * @comment 资源图标
	 */
	private java.lang.String resIcon;
	/*
	 * @comment 资源序号
	 */
	private java.lang.Integer resSeq;
	/*
	 * @comment 是否删除
	 */
	private Integer resDel;
	/*
	 * @comment 是否启用
	 */
	private Integer resStat;
	/*
	 * @comment 创建时间
	 */
	private java.util.Date creTime;
	
	public void setResId(java.lang.Integer value) {
		this.resId = value;
	}
	
	public java.lang.Integer getResId() {
		return this.resId;
	}
	public void setResName(java.lang.String value) {
		this.resName = value;
	}
	
	public java.lang.String getResName() {
		return this.resName;
	}
	public void setResType(Integer value) {
		this.resType = value;
	}
	
	public Integer getResType() {
		return this.resType;
	}
	public void setResUrl(java.lang.String value) {
		this.resUrl = value;
	}
	
	public java.lang.String getResUrl() {
		return this.resUrl;
	}
	public void setResDsc(java.lang.String value) {
		this.resDsc = value;
	}
	
	public java.lang.String getResDsc() {
		return this.resDsc;
	}
	public void setResParent(java.lang.Integer value) {
		this.resParent = value;
	}
	
	public java.lang.Integer getResParent() {
		return this.resParent;
	}
	public void setResIcon(java.lang.String value) {
		this.resIcon = value;
	}
	
	public java.lang.String getResIcon() {
		return this.resIcon;
	}
	public void setResSeq(java.lang.Integer value) {
		this.resSeq = value;
	}
	
	public java.lang.Integer getResSeq() {
		return this.resSeq;
	}
	public void setResDel(Integer value) {
		this.resDel = value;
	}
	
	public Integer getResDel() {
		return this.resDel;
	}
	public void setResStat(Integer value) {
		this.resStat = value;
	}
	
	public Integer getResStat() {
		return this.resStat;
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
