package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		ApplicationContext cmd=new ClassPathXmlApplicationContext("com/springcore/spel/Splconfig.xml");
		
		Demo d=cmd.getBean("demo",Demo.class);
		
		System.out.println(d);
	}
	
}
