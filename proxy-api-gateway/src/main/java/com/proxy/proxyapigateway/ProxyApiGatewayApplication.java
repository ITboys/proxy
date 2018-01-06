package com.proxy.proxyapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ProxyApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyApiGatewayApplication.class, args);
	}
}
