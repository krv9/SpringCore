package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		
		ApplicationContext cmd=new ClassPathXmlApplicationContext("com/springcore/stereotype/Stereoconfig.xml");
		
		Student std=cmd.getBean("obj" , Student.class);
		System.out.println(std);
		System.out.println("++++++++++++++++++");
		System.out.println(std.getCity());
	}
	
}
