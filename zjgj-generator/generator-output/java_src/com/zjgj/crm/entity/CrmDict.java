package com.zjgj.crm.entity;

import com.zjgj.crm.entity.base.BaseEntity;
/**
 * @comment CRM-字典
 * 
 * @author liuguangsheng
 */
public class CrmDict extends BaseEntity {
	
	/*
	 * @comment 字典ID
	 */
	private java.lang.Integer dictId;
	/*
	 * @comment 字典编码
	 */
	private java.lang.String dictCode;
	/*
	 * @comment 字典名称
	 */
	private java.lang.String dictName;
	/*
	 * @comment 元素编码
	 */
	private java.lang.String itemCode;
	/*
	 * @comment 元素名称
	 */
	private java.lang.String itemName;
	/*
	 * @comment 顺序码
	 */
	private Integer itemSeq;
	/*
	 * @comment 是否启用
	 */
	private Integer itemStat;
	/*
	 * @comment 是否删除
	 */
	private Integer itemDel;
	
	public void setDictId(java.lang.Integer value) {
		this.dictId = value;
	}
	
	public java.lang.Integer getDictId() {
		return this.dictId;
	}
	public void setDictCode(java.lang.String value) {
		this.dictCode = value;
	}
	
	public java.lang.String getDictCode() {
		return this.dictCode;
	}
	public void setDictName(java.lang.String value) {
		this.dictName = value;
	}
	
	public java.lang.String getDictName() {
		return this.dictName;
	}
	public void setItemCode(java.lang.String value) {
		this.itemCode = value;
	}
	
	public java.lang.String getItemCode() {
		return this.itemCode;
	}
	public void setItemName(java.lang.String value) {
		this.itemName = value;
	}
	
	public java.lang.String getItemName() {
		return this.itemName;
	}
	public void setItemSeq(Integer value) {
		this.itemSeq = value;
	}
	
	public Integer getItemSeq() {
		return this.itemSeq;
	}
	public void setItemStat(Integer value) {
		this.itemStat = value;
	}
	
	public Integer getItemStat() {
		return this.itemStat;
	}
	public void setItemDel(Integer value) {
		this.itemDel = value;
	}
	
	public Integer getItemDel() {
		return this.itemDel;
	}
	
	public String toString() {
		// TODO 需自己指定
		return "";
	}
}
