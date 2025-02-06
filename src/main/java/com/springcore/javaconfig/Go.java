package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Go {

	public static void main(String[] args) {
		
//		ApplicationContext cm=new ClassPathXmlApplicationContext("com/springcore/javaconfig/Javaconfig.xml");
		
		ApplicationContext cm=new AnnotationConfigApplicationContext(Config.class);
		
		Student std=cm.getBean("run" , Student.class);
		
		System.out.println(std);
		
		std.Study();
		
	}
	
}
