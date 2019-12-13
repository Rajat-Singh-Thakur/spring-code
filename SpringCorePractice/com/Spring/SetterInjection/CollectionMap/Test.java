package CollectionMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext appconn=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Question que=(Question)appconn.getBean("Mapanswer1");
		que.MyMethod();
	}
}
