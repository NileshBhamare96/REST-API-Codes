package in.nileshit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.nileshit.entity.User;
import in.nileshit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
//		User u1 = new User(101, "Raju", 24, "Male", "India");
//		User u2 = new User(102, "John", 14, "Male", "USA");
//		User u3 = new User(103, "Priyanka", 26, "Male", "India");
//		User u4 = new User(104, "Wick", 34, "Male", "UK");
//		User u5 = new User(105, "Lulia", 22, "Male", "Mexico");
//		User u6 = new User(106, "Priya", 44, "Male", "India");
//		User u7 = new User(107, "Smith", 25, "Male", "India");
//		User u8 = new User(108, "Jenifer", 35, "Male", "India");
//		User u9 = new User(109, "Singh", 24, "Male", "Canada");
//		User u10 = new User(110, "Shradhha", 24, "Male", "India");
//		
//		repository.saveAll(Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8,u9,u10));
//		
        int pageSize = 5 ;
        int pageNo = 2 ;
        
        PageRequest pageRequest = PageRequest.of(pageNo - 1, pageSize);
        Page<User> pageData = repository.findAll(pageRequest);
        
        int totalPages = pageData.getTotalPages();
        System.out.println("Total Pages : -> "+totalPages);
        
        List<User> users = pageData.getContent();
		users.forEach(user -> {
			System.out.println(user);
		});

	}

}
