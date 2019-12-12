package CIwithCollectionMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//Map
		ApplicationContext appconn=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student std=(Student)appconn.getBean("studentmap");
		std.MyMethod();
	}

}
