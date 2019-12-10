package com.Spring.Example10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext appconn=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp=(Employee)appconn.getBean("emp2");
		emp.MyMethod();
	}
}
