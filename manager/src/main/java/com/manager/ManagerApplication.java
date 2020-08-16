package com.manager;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
public class ManagerApplication {
	static Logger log=Logger.getLogger("ManagerApplication");
	public static void main(String[] args) {
		System.out.println("spring");
		SpringApplication.run(ManagerApplication.class, args);
	}

}
