package in.nileshit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.nileshit.entity.User;
import in.nileshit.repository.userRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		userRepository repository = context.getBean(userRepository.class);

		/*
		 * User u1 = new User(101, "Ganesh", "Male", 23, "India"); User u2 = new
		 * User(102, "Anvit", "Male", 15, "Ameroca"); User u3 = new User(103, "Nilesh",
		 * "Male", 33, "England"); User u4 = new User(104, "Arun", "Male", 40,
		 * "Shrilanka");
		 * 
		 * 
		 * repository.saveAll(Arrays.asList(u1 ,u2,u3,u4));
		 */

		// List<User> allUsersHql = repository.getAllUsersHql();
		// allUsersHql.forEach(users-> {System.out.println(users);});

		/*
		 * List<User> allUsersSql = repository.getAllUsersSql();
		 * 
		 * allUsersSql.forEach(users -> { System.out.println(users); });
		 */

		/* List<User> allUsersByCountry = repository.getAllUsersByCountry("India");
		allUsersByCountry.forEach(users -> {
			System.out.println(users);
		});
         */
		
	/*	List<User> allUsersByCountryAge = repository.getAllUsersByCountryAndAge("India",40);
		allUsersByCountryAge.forEach(users -> {
			System.out.println(users);
		});
		*/
		
		List<String> userNamesByCountryAndAge = repository.findUserNamesByCountryAndAge(Arrays.asList("India","England","Pakistan"), 25);
		userNamesByCountryAndAge.forEach(users -> {
			System.out.println(users);
		});
		
		
	}
}