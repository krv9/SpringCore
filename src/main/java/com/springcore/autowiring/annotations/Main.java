package com.springcore.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowiring/annotations/Autoconfig.xml");
		
		Emp emp1=context.getBean("emp1",Emp.class);
		
		System.out.println(emp1);
		
	}

}
