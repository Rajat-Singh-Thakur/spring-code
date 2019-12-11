package com.Spring.Example11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext appconn=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Employee emp=(Employee)appconn.getBean("employee11");
		emp.MyMethod();
	}
}
