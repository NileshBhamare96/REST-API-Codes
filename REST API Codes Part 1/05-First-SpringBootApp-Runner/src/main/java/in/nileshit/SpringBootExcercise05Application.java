package in.nileshit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootExcercise05Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringBootExcercise05Application.class, args);
		System.out.println(context.getClass().getName());
		System.out.println("Beans Loaded : -> " +context.getBeanDefinitionCount());
	}
}
