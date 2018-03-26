/**
 * @copyright remark holdings
 */
package com.proxy.proxya.domain.response;

import lombok.Data;

/**
 * @author kobe_t
 * @date 2018/3/26 9:00
 */
@Data
public class BaseResponse {

    /**
     * 成功结果
     */
    private boolean success;

    /**
     * 返回码
     */
    private String code;

    /**
     * 消息
     */
    private String message;
}
