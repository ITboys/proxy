/**
 * @copyright remark holdings
 */
package com.proxy.proxya.web.exception;

import com.proxy.proxya.web.enums.ResultCodeEnum;

/**
 * @author kobe_t
 * @date 2018/3/26 9:25
 */
public class BizException extends RuntimeException {

    /**
     * 错误码
     */
    ResultCodeEnum resultCode;

    /**
     * 构造函数
     *
     * @param resultCode 错误码
     */
    public BizException(ResultCodeEnum resultCode) {
        this(resultCode.getDescription(), resultCode);
    }

    /**
     * 构造函数
     *
     * @param message    错误信息
     * @param resultCode 错误码
     */
    public BizException(String message, ResultCodeEnum resultCode) {
        super(message);
        this.resultCode = resultCode;
    }

    public ResultCodeEnum getResultCode() {
        return resultCode;
    }
}

