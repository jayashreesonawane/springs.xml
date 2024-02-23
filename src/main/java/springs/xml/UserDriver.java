package springs.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class UserDriver {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("user.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		User user = beanFactory.getBean("use", User.class);
		System.out.println(user);
	}
}
