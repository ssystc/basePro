package com.base.pro.constant;

public enum BaseEnum {
	
	Enmu_1("000000", "信息1"),
	
	Enmu_2("000001", "信息2"),
	
	Enmu_3("000002", "信息3");
    
    private String code;

    private String message;

    BaseEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
	
}