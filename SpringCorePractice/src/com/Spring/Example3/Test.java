package com.Spring.Example3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	// Using Constructor
	public static void main(String[] args) {
		Resource res=new ClassPathResource("ApplicationContext.xml");
		BeanFactory fact=new XmlBeanFactory(res);
		
		Employee emp=(Employee)fact.getBean("employee");
		emp.MyMethod();	

	}

}
