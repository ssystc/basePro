package com.base.pro.exception;

import com.base.pro.constant.BaseEnum;

public class BaseException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String errCode;
	private String message;
	public BaseException(String message) {
        super(message);
    }
	public BaseException(String errCode, String message) {
		this.message = message;
		this.errCode = errCode;
	}
	public BaseException(BaseEnum baseEn) {
		this.message = baseEn.getMessage();
		this.errCode = baseEn.getCode();
	}
	
	public String getErrCode() {
		return errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
