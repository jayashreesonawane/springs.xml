package springs.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("student.xml");
		Student student = (Student) beanFactory.getBean("stud");
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getFatherName());
		System.out.println(student.getMotherName());
		System.out.println(student.getMarks());
	}
}
