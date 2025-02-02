package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/Samosaconfig.xml");
		
		Samosa samosa=(Samosa) context.getBean("samosa");
		
		System.out.println(samosa);
		
		context.registerShutdownHook();
		
		System.out.println("++++++++++++++++++");
		
		Pepsi pepsi=(Pepsi) context.getBean("pepsi");
		
		System.out.println(pepsi);		
		
		System.out.println("++++++++++++++++++");

		Example emp=(Example) context.getBean("subject");
		
		System.out.println(emp);
		
		
	}

}
