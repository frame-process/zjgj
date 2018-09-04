package com.zjgj.uc.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonResult implements java.io.Serializable {
	private static Logger logger = LoggerFactory.getLogger(JsonResult.class);
	private static final long serialVersionUID = 5472324976798303584L;

	private boolean success = false;

	private String msg;

	private Object data;
	
	private Object code;

	public boolean isSuccess() {
		return success;
	}
	public static JsonResult success() {
		return new JsonResult(ResultCode.SUCCESS);
	}
	public static JsonResult success(Object data) {
		return new JsonResult(ResultCode.SUCCESS, data);
	}
	public static JsonResult fail(ResultCode resultCode) {
		return new JsonResult(resultCode);
	}
	
	private JsonResult(ResultCode resultCode) {
		this.success = resultCode.getCode()==200;
		this.msg = resultCode.getMsg();
		this.code = resultCode.getCode();
	}
	private JsonResult(ResultCode resultCode, Object data) {
		this.success = resultCode.getCode()==200;
		this.msg = resultCode.getMsg();
		this.code = resultCode.getCode();
		this.data = data;
	}
	
	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	public Object getCode() {
		return code;
	}
	public void setCode(Object code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "code=" + code 
				+ ",msg=" + msg
				+ ",data=" + data;
	}
	public static void main(String[] args) {
		try {
			int a = 1/0;
		}catch(Exception err) {
			logger.info(ResultCode.ERROR.getExtMsg(),err);
		}
	}
}