package com.yogesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FormBasedSpringMvcAppApplication {

            
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FormBasedSpringMvcAppApplication.class, args);
		
		 System.out.println("Welcome to My First Form Based Spring Mvc App ....!");


	
//context.close();	
	}

}
