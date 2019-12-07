package com.Spring.Example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	// Using getter setter methods
	public static void main(String[] args) {
		ApplicationContext appconn=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp=(Employee)appconn.getBean("employee1");
		emp.MyMethod();
	}
}
