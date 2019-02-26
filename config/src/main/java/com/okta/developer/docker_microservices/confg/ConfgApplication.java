package com.okta.developer.docker_microservices.confg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfgApplication.class, args);
	}

}
