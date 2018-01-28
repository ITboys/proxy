package com.proxy.proxya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
public class ProxyAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyAApplication.class, args);
	}
}
