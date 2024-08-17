package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NormalSpringBootProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(NormalSpringBootProject1Application.class, args);
		
		System.out.println("this is line number 1");
		
		System.out.println("this is line number 2");
		System.out.println("this is line number 3");
		
		System.out.println("this is line number 4");

		System.out.println("this is line number 5");
	}

}
