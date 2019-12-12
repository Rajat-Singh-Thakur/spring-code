package BeanFactoryInterface;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args){
		
		// Using BeanFactory interface 
		
		Resource rec=new ClassPathResource("ApplicationContext.xml");
		BeanFactory fact= new XmlBeanFactory(rec);
		
		Student std=(Student)fact.getBean("studentbean");
		std.MyMethod();
	}
}
