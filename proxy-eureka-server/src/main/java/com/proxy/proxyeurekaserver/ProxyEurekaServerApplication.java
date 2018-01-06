package com.proxy.proxyeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ProxyEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyEurekaServerApplication.class, args);
	}
}
