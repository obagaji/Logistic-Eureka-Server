package com.jtc.LogisticEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication

public class LogisticEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogisticEurekaServerApplication.class, args);
	}

}
