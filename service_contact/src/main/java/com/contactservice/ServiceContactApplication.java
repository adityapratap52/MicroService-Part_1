package com.contactservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceContactApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceContactApplication.class, args);
	}

}
