package in.nileshit;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import in.nileshit.security.AppSecurity;

@Component
public class Car {

	public Car() {
		System.out.println("Car :: Constructor");
	}
    
//	@Bean  //IOC calling this method
//	public AppSecurity createInstance()
//	{
//		AppSecurity as = new AppSecurity();
//		return as ;
//	}

}
