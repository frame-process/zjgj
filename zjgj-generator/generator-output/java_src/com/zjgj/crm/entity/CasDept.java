package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment 部门信息表
 * 
 * @author liuguangsheng
 */
public class CasDept extends BaseEntity {
	
	/*
	 * @comment 部门ID
	 */
	private java.lang.Integer deptId;
	/*
	 * @comment 部门名称
	 */
	private java.lang.String deptName;
	/*
	 * @comment 父级部门
	 */
	private java.lang.Integer deptParent;
	/*
	 * @comment 是否启用
	 */
	private Integer deptStat;
	/*
	 * @comment 是否删除
	 */
	private Integer deptDel;
	/*
	 * @comment 部门图标
	 */
	private java.lang.String deptIcon;
	/*
	 * @comment 顺序号
	 */
	private java.lang.Integer deptSeq;
	/*
	 * @comment 创建时间
	 */
	private java.util.Date creTime;
	
	public void setDeptId(java.lang.Integer value) {
		this.deptId = value;
	}
	
	public java.lang.Integer getDeptId() {
		return this.deptId;
	}
	public void setDeptName(java.lang.String value) {
		this.deptName = value;
	}
	
	public java.lang.String getDeptName() {
		return this.deptName;
	}
	public void setDeptParent(java.lang.Integer value) {
		this.deptParent = value;
	}
	
	public java.lang.Integer getDeptParent() {
		return this.deptParent;
	}
	public void setDeptStat(Integer value) {
		this.deptStat = value;
	}
	
	public Integer getDeptStat() {
		return this.deptStat;
	}
	public void setDeptDel(Integer value) {
		this.deptDel = value;
	}
	
	public Integer getDeptDel() {
		return this.deptDel;
	}
	public void setDeptIcon(java.lang.String value) {
		this.deptIcon = value;
	}
	
	public java.lang.String getDeptIcon() {
		return this.deptIcon;
	}
	public void setDeptSeq(java.lang.Integer value) {
		this.deptSeq = value;
	}
	
	public java.lang.Integer getDeptSeq() {
		return this.deptSeq;
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
