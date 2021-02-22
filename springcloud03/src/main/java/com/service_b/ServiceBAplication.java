package com.service_b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ServiceBAplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceBAplication.class, args);
	}
}
