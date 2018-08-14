package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment CRM-附件表
 * 
 * @author liuguangsheng
 */
public class CrmUploadFile extends BaseEntity {
	
	/*
	 * @comment 文件ID
	 */
	private java.lang.Long fileId;
	/*
	 * @comment 文件类型
	 */
	private Integer fileType;
	/*
	 * @comment 关联ID
	 */
	private java.lang.Long filePkid;
	/*
	 * @comment 文件大小
	 */
	private java.lang.Long fileSize;
	/*
	 * @comment 文件名称
	 */
	private java.lang.String fileName;
	/*
	 * @comment 文件URL
	 */
	private java.lang.String fileUrl;
	/*
	 * @comment 文件存储地址
	 */
	private java.lang.String fileStg;
	/*
	 * @comment 文件IP
	 */
	private java.lang.Long fileIp;
	/*
	 * @comment 扩展名
	 */
	private java.lang.String fileExt;
	/*
	 * @comment 访问次数
	 */
	private java.lang.Long visiCount;
	/*
	 * @comment 是否删除
	 */
	private Integer fileDel;
	/*
	 * @comment 文件IP
	 */
	private java.util.Date creTime;
	
	public void setFileId(java.lang.Long value) {
		this.fileId = value;
	}
	
	public java.lang.Long getFileId() {
		return this.fileId;
	}
	public void setFileType(Integer value) {
		this.fileType = value;
	}
	
	public Integer getFileType() {
		return this.fileType;
	}
	public void setFilePkid(java.lang.Long value) {
		this.filePkid = value;
	}
	
	public java.lang.Long getFilePkid() {
		return this.filePkid;
	}
	public void setFileSize(java.lang.Long value) {
		this.fileSize = value;
	}
	
	public java.lang.Long getFileSize() {
		return this.fileSize;
	}
	public void setFileName(java.lang.String value) {
		this.fileName = value;
	}
	
	public java.lang.String getFileName() {
		return this.fileName;
	}
	public void setFileUrl(java.lang.String value) {
		this.fileUrl = value;
	}
	
	public java.lang.String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileStg(java.lang.String value) {
		this.fileStg = value;
	}
	
	public java.lang.String getFileStg() {
		return this.fileStg;
	}
	public void setFileIp(java.lang.Long value) {
		this.fileIp = value;
	}
	
	public java.lang.Long getFileIp() {
		return this.fileIp;
	}
	public void setFileExt(java.lang.String value) {
		this.fileExt = value;
	}
	
	public java.lang.String getFileExt() {
		return this.fileExt;
	}
	public void setVisiCount(java.lang.Long value) {
		this.visiCount = value;
	}
	
	public java.lang.Long getVisiCount() {
		return this.visiCount;
	}
	public void setFileDel(Integer value) {
		this.fileDel = value;
	}
	
	public Integer getFileDel() {
		return this.fileDel;
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
