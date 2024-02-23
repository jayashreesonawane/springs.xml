package springs.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeDriver {

	public static void main(String[] args) {
		//using beanFactory 
//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("employee.xml");
//		Employee employee = (Employee) beanFactory.getBean("emp");
//		System.out.println(employee);
		
		// using beanFactory resource which is deprecated 
		Resource resource = new ClassPathResource("employee.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Employee employee= beanFactory.getBean("emp",Employee.class);
		System.out.println(employee);
	}
}
