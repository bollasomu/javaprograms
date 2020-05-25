package com.microservice.AppMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppMicroserviceApplication.class, args);
	}

}
