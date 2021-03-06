package com.rollingstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration // Sprint Boot Auto Configuration
@ComponentScan(basePackages = "com.rollingstone")

public class SpringBootPersonMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPersonMicroservice.class, args);
	}
}
