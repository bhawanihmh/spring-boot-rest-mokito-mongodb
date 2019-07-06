package com.bhawani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.bhawani.*", "com.bhawani.controller" })
public class SpringBootRestMokitoMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestMokitoMongodbApplication.class, args);
	}

}
