package com.proxy.proxya.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.proxy.proxya.domain.BizResult;
import com.proxy.proxya.domain.account.Register;
import com.proxy.proxya.web.service.RegisterService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	@PostMapping()
	@ResponseBody()
	public BizResult register(Register register) {
		registerService.register(register);
		BizResult result = new BizResult();
		return result;
	}

}
