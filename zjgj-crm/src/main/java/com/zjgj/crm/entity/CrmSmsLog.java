package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment CRM-短信日志
 * 
 * @author liuguangsheng
 */
public class CrmSmsLog extends BaseEntity {
	
	/*
	 * @comment 短信ID
	 */
	private java.lang.Long smsLogId;
	/*
	 * @comment 手机号
	 */
	private java.lang.String smsMobile;
	/*
	 * @comment 短信内容
	 */
	private java.lang.String smsContent;
	/*
	 * @comment 调用参数
	 */
	private java.lang.String smsParm;
	/*
	 * @comment 返回结果
	 */
	private java.lang.String smsResult;
	/*
	 * @comment 创建ID
	 */
	private java.lang.Long creId;
	/*
	 * @comment 创建人
	 */
	private java.lang.String creName;
	/*
	 * @comment 操作IP
	 */
	private java.lang.Long creIp;
	/*
	 * @comment 发送时间
	 */
	private java.util.Date creTime;
	
	public void setSmsLogId(java.lang.Long value) {
		this.smsLogId = value;
	}
	
	public java.lang.Long getSmsLogId() {
		return this.smsLogId;
	}
	public void setSmsMobile(java.lang.String value) {
		this.smsMobile = value;
	}
	
	public java.lang.String getSmsMobile() {
		return this.smsMobile;
	}
	public void setSmsContent(java.lang.String value) {
		this.smsContent = value;
	}
	
	public java.lang.String getSmsContent() {
		return this.smsContent;
	}
	public void setSmsParm(java.lang.String value) {
		this.smsParm = value;
	}
	
	public java.lang.String getSmsParm() {
		return this.smsParm;
	}
	public void setSmsResult(java.lang.String value) {
		this.smsResult = value;
	}
	
	public java.lang.String getSmsResult() {
		return this.smsResult;
	}
	public void setCreId(java.lang.Long value) {
		this.creId = value;
	}
	
	public java.lang.Long getCreId() {
		return this.creId;
	}
	public void setCreName(java.lang.String value) {
		this.creName = value;
	}
	
	public java.lang.String getCreName() {
		return this.creName;
	}
	public void setCreIp(java.lang.Long value) {
		this.creIp = value;
	}
	
	public java.lang.Long getCreIp() {
		return this.creIp;
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
