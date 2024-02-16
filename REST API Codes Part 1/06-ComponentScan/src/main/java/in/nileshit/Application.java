package in.nileshit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import in.nileshit.security.AppSecurity;

@SpringBootApplication
@ComponentScan(basePackages = {"in.nileshit,com.wallmart"} )
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	/* you can keep this method any class if the class have @COmponent annotation
	but you can't keep in AppSecurity because its not declared as Spring Bean  
	
	in short method should be present in Spring Bean class
	
	option is @Configuration annotaion 
	*/
	
//	@Bean  //IOC calling this method
//	public AppSecurity createInstance()
//	{
//		AppSecurity as = new AppSecurity();
//		return as ;
//	}

}
