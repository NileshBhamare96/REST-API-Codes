package in.nileshit;

import java.util.Arrays;
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

		/*User u1 = new User(101, "Ganesh", "Male", 23, "India");

		 repository.save(u1); */
     
		/*
		User u2 = new User(102, "Anvit", "Male", 15, "India");
		User u3 = new User(103, "Nilesh", "Male", 33, "India");
		User u4 = new User(104, "Arun", "Male", 40, "India");

		repository.saveAll(Arrays.asList(u2,u3,u4)); */

		/*
		 * Optional<User> findById = repository.findById(102);
		 * 
		 * Optional<User> findById = repository.findById(102);
		 * 
		 * if (findById.isPresent()) { System.out.println(findById.get()); }
		 */

		/*
		 * Iterable<User> allById = repository.findAllById(Arrays.asList(101, 120, 103,
		 * 104));
		 * 
		 * allById.forEach(user -> { System.out.println(user); });
		 */

		/*
		 * User u5 = new User(105, "Shekhar", "Male", 27, "India"); User u6 = new
		 * User(106, "Sonu", "Male", 35, "India"); User u7 = new User(107, "Bharat",
		 * "Male", 36, "India");
		 * 
		 * repository.saveAll(Arrays.asList(u5,u6,u7));
		 */

		/*
		 * long count = repository.count();
		 * System.out.println("Total Records in table : "+count);
		 */

		/*
		 * boolean existsById = repository.existsById(107);
		 * System.out.println("Record Presence with ID 107 : "+existsById);
		 */

		// repository.deleteById(107);
		//repository.deleteAllById(Arrays.asList(101, 102, 111));
		
		
		User u7 = new User(107, "Inaa", "Female", 25, "India");
		User u8 = new User(108, "Meena", "Female", 28, "India");
		User u9 = new User(109, "Digaa", "Female", 30, "India");
		
		repository.saveAll(Arrays.asList(u7,u8,u9));

		// repository.saveAll(Arrays.asList(u2,u3,u4));

	}

}
