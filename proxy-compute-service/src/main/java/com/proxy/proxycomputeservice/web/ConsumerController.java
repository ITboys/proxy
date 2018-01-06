package com.proxy.proxycomputeservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

public class ConsumerController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
		return restTemplate.getForEntity("http://proxy-api-gateway/api-a/add?a=" + a + "&b=" + b, String.class).getBody();
	}

}
