package com.zjgj.uc.vo;

/**
 * @comment 用户信息表
 * 
 * @author liuguangsheng
 */
public class CasUserVo {
	
	/*
	 * @comment 用户ID
	 */
	private java.lang.Long userId;
	/*
	 * @comment 部门ID
	 */
	private java.lang.Integer deptId;
	/*
	 * @comment 用户帐号
	 */
	private java.lang.String userAcc;
	/*
	 * @comment 用户密码
	 */
	private java.lang.String userPass;
	/*
	 * @comment 用户名称
	 */
	private java.lang.String userName;
	/*
	 * @comment 用户类型
	 */
	private Integer userType;
	/*
	 * @comment 手机号
	 */
	private java.lang.String userMobile;
	/*
	 * @comment 电话
	 */
	private java.lang.String userPhone;
	/*
	 * @comment 用户级别
	 */
	private Integer userLevel;
	/*
	 * @comment 城市
	 */
	private java.lang.Integer userCity;
	/*
	 * @comment 入职时间
	 */
	private java.util.Date entryTime;
	/*
	 * @comment 启用状态
	 */
	private Integer userStat;
	/*
	 * @comment 是否删除
	 */
	private Integer userDel;
	/*
	 * @comment 上级领导
	 */
	private java.lang.Long leaderId;
	/*
	 * @comment 上级名称
	 */
	private java.lang.String leaderName;
	/*
	 * @comment 创建时间
	 */
	private java.util.Date creTime;
	
	public void setUserId(java.lang.Long value) {
		this.userId = value;
	}
	
	public java.lang.Long getUserId() {
		return this.userId;
	}
	public void setDeptId(java.lang.Integer value) {
		this.deptId = value;
	}
	
	public java.lang.Integer getDeptId() {
		return this.deptId;
	}
	public void setUserAcc(java.lang.String value) {
		this.userAcc = value;
	}
	
	public java.lang.String getUserAcc() {
		return this.userAcc;
	}
	public void setUserPass(java.lang.String value) {
		this.userPass = value;
	}
	
	public java.lang.String getUserPass() {
		return this.userPass;
	}
	public void setUserName(java.lang.String value) {
		this.userName = value;
	}
	
	public java.lang.String getUserName() {
		return this.userName;
	}
	public void setUserType(Integer value) {
		this.userType = value;
	}
	
	public Integer getUserType() {
		return this.userType;
	}
	public void setUserMobile(java.lang.String value) {
		this.userMobile = value;
	}
	
	public java.lang.String getUserMobile() {
		return this.userMobile;
	}
	public void setUserPhone(java.lang.String value) {
		this.userPhone = value;
	}
	
	public java.lang.String getUserPhone() {
		return this.userPhone;
	}
	public void setUserLevel(Integer value) {
		this.userLevel = value;
	}
	
	public Integer getUserLevel() {
		return this.userLevel;
	}
	public void setUserCity(java.lang.Integer value) {
		this.userCity = value;
	}
	
	public java.lang.Integer getUserCity() {
		return this.userCity;
	}
	public void setEntryTime(java.util.Date value) {
		this.entryTime = value;
	}
	
	public java.util.Date getEntryTime() {
		return this.entryTime;
	}
	public void setUserStat(Integer value) {
		this.userStat = value;
	}
	
	public Integer getUserStat() {
		return this.userStat;
	}
	public void setUserDel(Integer value) {
		this.userDel = value;
	}
	
	public Integer getUserDel() {
		return this.userDel;
	}
	public void setLeaderId(java.lang.Long value) {
		this.leaderId = value;
	}
	
	public java.lang.Long getLeaderId() {
		return this.leaderId;
	}
	public void setLeaderName(java.lang.String value) {
		this.leaderName = value;
	}
	
	public java.lang.String getLeaderName() {
		return this.leaderName;
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
