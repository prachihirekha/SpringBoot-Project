package com.patient_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.controller")
public class PatientApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatientApplication.class, args);
		System.out.println("oooooo");
	}

}
