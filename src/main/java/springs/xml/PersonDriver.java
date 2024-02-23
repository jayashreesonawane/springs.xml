package springs.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("Person.xml");
		Person person = (Person) beanFactory.getBean("person1");
		person.walk();
		System.out.println(person.getName());
		System.out.println(person.getAge());
	}
}
