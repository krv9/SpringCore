package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class Config {
	
	@Bean
	public Samosa runs() {
		return new Samosa();
	}
	
	@Bean
	public Student run() {
		
		Student std=new Student(runs());
		return std;
		
	}

}
