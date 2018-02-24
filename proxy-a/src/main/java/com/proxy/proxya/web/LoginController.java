/**
 * @copyright remark holdings
 */
package com.proxy.proxya.web;

import com.proxy.proxya.domain.request.LoginRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @author kobe_t
 * @date 2018/2/8 8:48
 */
@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @RequestMapping("/")
    @ResponseBody
    public void LoginResponse(@Valid @RequestBody LoginRequest request) {
        log.info("{}", request);
    }


}
