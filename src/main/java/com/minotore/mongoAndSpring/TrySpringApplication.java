package com.minotore.mongoAndSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TrySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrySpringApplication.class, args);
	}

}
