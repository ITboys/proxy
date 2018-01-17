package com.proxy.proxya.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proxy.proxya.domain.Pay;

@Controller
@RequestMapping("/pay")
public class PayController {

	@RequestMapping("/buy")
	public String buy() {
		return "buy";
	}
	
	@RequestMapping("/pay")
	public String pay(Pay pay){
		System.out.println(pay);
		return "pay";
	}

}
