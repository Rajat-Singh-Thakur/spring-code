package DependacyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	 // constructor dependancy injection 
	public static void main(String[] args) {
		Resource res=new ClassPathResource("ApplicationContext.xml");
		BeanFactory fact=new XmlBeanFactory(res);
		
		Student std=(Student)fact.getBean("student1");
		std.Mymethod();

	}
}
