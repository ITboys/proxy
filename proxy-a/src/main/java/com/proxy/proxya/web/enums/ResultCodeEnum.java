package com.proxy.proxya.web.enums;

/**
 * @author kobe_t
 * @date 2018/3/26 9:22
 */
public enum ResultCodeEnum {

    ;

    private final String code;

    private final String description;

    ResultCodeEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
