package com.example.weblab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.weblab.model") // Varlıklarınızın olduğu paket
public class WeblabApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeblabApplication.class, args);
	}
}
