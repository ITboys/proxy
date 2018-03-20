/**
 * @copyright remark holdings
 */
package com.proxy.proxya.web.service.impl;

import com.proxy.proxya.domain.request.LoginRequest;
import com.proxy.proxya.web.mapper.UserMapper;
import com.proxy.proxya.web.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kobe_t
 * @date 2018/3/20 9:13
 */
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void login(LoginRequest request) {

    }
}
