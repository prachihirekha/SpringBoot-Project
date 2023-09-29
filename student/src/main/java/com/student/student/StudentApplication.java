package com.student.student;

import com.student.student.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringBootApplication
public class StudentApplication  {
	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
		System.out.println("Hey boi !");
	}


}
