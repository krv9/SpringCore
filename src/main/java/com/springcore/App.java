package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new  ClassPathXmlApplicationContext("Config.xml");
        Student std1=(Student) context.getBean("Student1");
        Student std2=(Student) context.getBean("Student2");

       System.out.println(std1);
       System.out.println(std2);
    }
}
