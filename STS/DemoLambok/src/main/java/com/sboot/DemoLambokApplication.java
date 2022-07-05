package com.sboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoLambokApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoLambokApplication.class, args);
		
		Student s = new Student();
		s.setId(101);
		s.setName("Ajay");
		
		System.out.println(s);
	}

}
