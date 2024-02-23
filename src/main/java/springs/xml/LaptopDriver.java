package springs.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {

	public static void main(String[] args) {
		//using new keyword
//		Laptop laptop = new Laptop();
//		laptop.used();
		
		//using Springs
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("laptop.xml");
		Laptop laptop = (Laptop) beanFactory.getBean("laptop1");
		laptop.used();
	}
}
