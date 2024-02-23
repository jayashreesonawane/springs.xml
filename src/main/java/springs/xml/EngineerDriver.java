package springs.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EngineerDriver {

	public static void main(String[] args) {
		// conventional way
//		Engineer engineer = new Mechanical();
//		engineer.stream();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("engineer.xml");
		Engineer engineer = applicationContext.getBean("mech", Mechanical.class);
		engineer.stream();

		Engineer engineer2 = applicationContext.getBean("civi", Civil.class);
		engineer2.stream();
		
		Engineer engineer3 = applicationContext.getBean("comp", Computer.class);
		engineer3.stream();
	}
}
