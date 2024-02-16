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
		/*
		 * List<User> country = repository.findByCountry("India"); country.forEach(User
		 * -> { System.out.println(User); });
		 */

		/*
		 * List<User> byAge = repository.findByAge(40);
		 * 
		 * byAge.forEach(User -> { System.out.println(User); });
		 */
		/*
		 * List<User> byAge = repository.findByAgeIsLessThan(40);
		 * 
		 * byAge.forEach(User -> { System.out.println(User); });
		 */
		/*
		 * List<User> byGender = repository.findByGender("Male");
		 * 
		 * byGender.forEach(User -> { System.out.println(User); });
		 */

		/*
		 * List<User> age= repository.findByAgeGreaterThanEqual(25);
		 * 
		 * age.forEach(User -> { System.out.println(User); });
		 */

		/*
		 * List<User> countryname = repository.findByCountryIn(Arrays.asList("India",
		 * "England"));
		 * 
		 * cname.forEach(User -> { System.out.println(User); });
		 */

		/*
		 * List<User> cnameANDage = repository.findByCountryAndAge("India", 23);
		 * 
		 * cnameANDage.forEach(User -> { System.out.println(User); });
		 */

		List<User> CnameANDAgeANDAge = repository.findByCountryAndAgeAndGender("Shrilanka", 40, "Male");

		CnameANDAgeANDAge.forEach(User -> {
			System.out.println(User);
		});
	}

}
