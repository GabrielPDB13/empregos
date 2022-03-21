package com.empresa.empregos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.empresa.empregos.controller")
public class EmpregosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpregosApplication.class, args);
	}

}

//o "vaga" é o "empregos"//
