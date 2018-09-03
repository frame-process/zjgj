package com.zjgj.uc.dict;

public enum DistStatEnum {
	UNASSIGNED(0, "0", "未分配"), 
	ALLOCATED(1, "1", "已分配");
	
	
	private int id;
	private String key;
	private String val;

	DistStatEnum(int id, String key, String val) {
		this.id = id;
		this.key = key;
		this.val = val;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
	@Override
	public String toString() {
		return key+"="+val;
	}
}