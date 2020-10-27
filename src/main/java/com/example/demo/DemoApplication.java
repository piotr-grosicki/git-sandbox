package com.example.demo;

import org.springframework.boot.SpringApplication;

public class DemoApplication {

	private String elo = "elo";


	public static void main(String[] args) {
		System.out.println("ELO");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("ELO2");
	}

}
