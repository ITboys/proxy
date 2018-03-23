package com.proxy.proxya.domain.account;

import java.util.Date;

import com.proxy.proxya.domain.BaseBean;
import lombok.Data;

/**
 * 用户
 *
 * @author kobe_t
 * @date 2018/3/23 8:54
 */
@Data
public class User extends BaseBean {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private Long phone;

    /**
     * 用户状态
     */
    private Integer status;

    private Date createTime;

    private Date updateTime;


}
