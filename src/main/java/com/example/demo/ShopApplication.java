package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "com.example.controllers", "com.example.model", 
		"com.example.repository", "com.example.service"})
@EntityScan(basePackages = {"com.example.demo", "com.example.controllers", "com.example.model", 
		"com.example.repository", "com.example.service"})
public class ShopApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

}
