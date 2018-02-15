/**
 * @copyright remark holdings
 */
package com.proxy.proxya.domain.request;

import lombok.Data;

/**
 * @author kobe_t
 * @date 2018/2/8 8:58
 */
@Data
public class LoginRequest {

    /** 用户名 */
    private String userName;

    /** 密码 */
    private String password;

    /** 手机号 */
    private String phone;

}
