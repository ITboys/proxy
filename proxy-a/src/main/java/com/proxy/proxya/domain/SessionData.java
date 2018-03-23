/**
 * @copyright remark holdings
 */
package com.proxy.proxya.domain;

import lombok.Data;

/**
 * 用户相关的session数据
 *
 * @author kobe_t
 * @date 2018/3/23 8:54
 */
@Data
public class SessionData {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户状态
     */
    private Integer status;

}
