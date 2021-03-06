package com.qr.anti.base;

public class ReturnValue extends BaseValue {
    private static final long serialVersionUID = -5655757386004172231L;

    private String code;

    private String desc;

    public ReturnValue() {
    }

    public ReturnValue(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ReturnValue success() {
        ReturnValue returnValue = new ReturnValue("200", "success");
        return returnValue;
    }

    public static ReturnValue failure(String desc) {
        ReturnValue returnValue = new ReturnValue("500", desc);
        return returnValue;
    }

    public static ReturnValue customReturn(String desc) {
        ReturnValue returnValue = new ReturnValue("200", desc);
        return returnValue;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
