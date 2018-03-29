/**
 * @copyright remark holdings
 */
package com.proxy.proxya.web.service.impl;

import com.proxy.proxya.domain.request.LoginRequest;
import com.proxy.proxya.domain.response.BaseResponse;
import com.proxy.proxya.domain.response.LoginResponse;
import com.proxy.proxya.web.mapper.UserMapper;
import com.proxy.proxya.web.service.LoginService;
import com.proxy.proxya.web.template.BizCallback;
import com.proxy.proxya.web.template.BizServiceTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kobe_t
 * @date 2018/3/20 9:13
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void login(LoginRequest request) {

        LoginResponse response = new LoginResponse();

        BizServiceTemplate.execute(request, response, (LoginRequest r, LoginResponse t) ->
                userMapper.findByNameAndPassword(request)
        );

    }
}
