package com.Spring.Example8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext appconn=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student std=(Student)appconn.getBean("studentmap");
		std.MyMethod();
	}

}
