package com.zjgj.uc.entity.base;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BaseEntity implements Serializable {
	
	private Map<String,Object> extData = new HashMap<>();
	public Map<String, Object> getExtData() {
		return extData;
	}

	public void setExtData(Map<String, Object> extData) {
		this.extData = extData;
	}
	
	
}
