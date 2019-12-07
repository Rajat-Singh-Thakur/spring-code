package com.Spring.Example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.Example1.Student;

public class Test {
	
	// Using ApplicationContext   interface

	public static void main(String[] args) {
		ApplicationContext appcon=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student std=(Student)appcon.getBean("studentbean");
		std.MyMethod();

	}
}
