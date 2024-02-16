package in.nileshit.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppSecurity {

	public AppSecurity() {
		System.out.println("AppSecurity :: Constructor");

	}
	
	@Bean  //IOC calling this method
	public AppSecurity createInstance()
	{
		AppSecurity as = new AppSecurity();
		return as ;
	}

}
