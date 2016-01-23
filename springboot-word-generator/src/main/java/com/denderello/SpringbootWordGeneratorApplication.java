package com.denderello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class SpringbootWordGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWordGeneratorApplication.class, args);
	}
}
