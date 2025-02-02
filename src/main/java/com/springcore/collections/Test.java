package com.springcore.collections;

import java.awt.image.renderable.ContextualRenderedImageFactory;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext cntxt=new  ClassPathXmlApplicationContext("com/springcore/collections/Collectionconfig.xml");
		Employee emp=(Employee) cntxt.getBean("emp1");
		
		System.out.println(emp.getName());
		System.out.println(emp.getEmail());
		System.out.println(emp.getPhoneNumber());
		System.out.println(emp.getCourses());
		
	}

}
