package com.proxy.proxyb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProxyBApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyBApplication.class, args);
	}
}
