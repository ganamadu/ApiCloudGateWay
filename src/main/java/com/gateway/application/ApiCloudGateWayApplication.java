package com.gateway.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.gateway")
public class ApiCloudGateWayApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ApiCloudGateWayApplication.class, args);
	}

}
