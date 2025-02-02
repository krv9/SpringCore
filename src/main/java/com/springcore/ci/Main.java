package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/Ciconfig.xml");
		
		Person p=(Person)context.getBean("person");
		
		System.out.println(p);
		
		Addition ad=(Addition)context.getBean("add");
		
		ad.dosum();
		
		System.out.print(ad);

	}

}
