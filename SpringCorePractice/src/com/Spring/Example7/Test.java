package com.Spring.Example7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	 // constructor injection in collection list
	public static void main(String[] args) {
		ApplicationContext appconn=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Question que=(Question)appconn.getBean("question1");
		que.MyMethod();
	}

}
