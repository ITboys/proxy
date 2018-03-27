package com.proxy.proxya.web.enums;

import com.proxy.proxya.web.util.Constants;

/**
 * @author kobe_t
 * @date 2018/3/26 9:22
 */
public enum ResultCodeEnum {

    /**
     * 成功操作
     */
    SUCCESS(Constants.SUCCESS_CODE, "SUCCESS"),
    /**
     * 未知异常
     */
    UNKNOW_EXCEPTION("0500", "UNKNOW_EXCEPTION");

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
