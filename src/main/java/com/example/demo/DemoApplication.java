package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class DemoApplication {

	private String elo = "elo";


	public static void main(String[] args) {
		System.out.println("ELO");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("ELO");
		System.out.println("ELO");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("ELO");
		System.out.println("ELO");
	}

}
