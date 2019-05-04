package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.controller")
@ComponentScan("com.model")
@ComponentScan("com.service")
@ComponentScan("com.dao")
@EntityScan(basePackages = {"com.model"})
@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
