package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		
		ApplicationContext cmd=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/Standaloneconfig.xml");
		
		Person p=cmd.getBean("person1", Person.class);
		
		System.out.println(p);
		
		System.out.println(p.getFriends().getClass().getName());
		
		System.out.println("++++++++++++++++");
		
		System.out.println(p.getFeestructure());
		
		System.out.println("++++++++++++++++");
		
		System.out.println(p.getProperties());
		
	}
	
}
