package in.nileshit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[])throws Exception
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		Car car1 = context.getBean("car",Car.class);
		System.out.println(car1.hashCode());
		
		Car car2 = context.getBean("car",Car.class);
		System.out.println(car2.hashCode());
		
		Motor motor1 = context.getBean("motor",Motor.class);
		System.out.println(motor1.hashCode());
		
		Motor motor2 = context.getBean("motor",Motor.class);
		System.out.println(motor2.hashCode());
	}

}
