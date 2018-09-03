package com.zjgj.uc.dict;

public enum DelTagEnum {
	NO(0, "0", "否"), 
	YES(1, "1", "是");
	
	
	private int id;
	private String key;
	private String val;

	DelTagEnum(int id, String key, String val) {
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