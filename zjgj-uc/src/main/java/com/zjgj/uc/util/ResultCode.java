package com.zjgj.uc.util;


/**
 * @desc   结果编码处理
 * @author liuguangsheng
 *
 */
public enum ResultCode {

    SUCCESS(200, "成功", "成功"),
    ERROR(500, "请联系管理员", "错误信息"),
    PARAM_ERROR(501, "没有数据", "没有数据"),
    DATA_NULL(502, "参数错误", "参数错误"),
    NOT_LOGIN(203, "没有登陆", "没有登陆");


    private int code;
    private String msg;
    private String extMsg;

    private ResultCode(int code, String msg, String extMsg) {
        this.code = code;
        this.msg = msg;
        this.extMsg = extMsg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String serverDesc) {
        this.msg = serverDesc;
    }

    public String getExtMsg() {
        return extMsg;
    }

    public void setExtMsg(String externalDesc) {
        this.extMsg = externalDesc;
    }
}
