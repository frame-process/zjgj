package com.zjgj.uc.dict;

public enum SmsTypeEnum {
	DEFAULT(0, "0", "普通"), 
	A(1, "1", "A"), 
	B(2, "2", "B"), 
	C(3, "3", "C");
	
	
	private int id;
	private String key;
	private String val;

	SmsTypeEnum(int id, String key, String val) {
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