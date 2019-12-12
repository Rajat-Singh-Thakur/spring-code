package ApplicationContextInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import BeanFactoryInterface.Student;

public class Test {
	
	// Using ApplicationContext   interface

	public static void main(String[] args) {
		ApplicationContext appcon=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student std=(Student)appcon.getBean("studentbean");
		std.MyMethod();

	}
}
