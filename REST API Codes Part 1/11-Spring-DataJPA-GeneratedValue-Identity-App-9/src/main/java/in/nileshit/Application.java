package in.nileshit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.nileshit.entity.Product;
import in.nileshit.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		ProductRepository repository = context.getBean(ProductRepository.class);

		// insert
		/*
		 * Product p1 = new Product();
		 * 
		 * p1.setPname("Keyboard"); p1.setPrice(250.0);
		 * 
		 * repository.save(p1);
		 */

		// update
		/*
		 * Product p1 = new Product(); p1.setPid(1); p1.setPname("Keyboard");
		 * p1.setPrice(250.0);
		 * 
		 * repository.save(p1);
		 */

	}

}
