package springs.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mobile.xml");
		Mobile mobile = applicationContext.getBean("mobi",Mobile.class);
		mobile.use();
	}
}
