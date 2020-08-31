package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class MovieTrendsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieTrendsApplication.class, args);
	}

}
