package com.qr.anti.exception;


import java.text.MessageFormat;

public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 6961926234532027069L;
    private String code;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException() {
    }

    public BusinessException(String code, String msg) {
        this(msg);
        this.code = code;
    }

    public BusinessException(Enum<?> en) {
        this(en.name(), en.toString());
    }

    public BusinessException(Enum<?> en, Object... args) {
        this(en.name(), MessageFormat.format(en.toString(), args));
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
