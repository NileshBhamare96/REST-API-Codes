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


		Product p1 = new Product();

		p1.setPname("Keyboard");
		p1.setPrice(300.0);

		repository.save(p1);
	
		
		/*Product p2 = new Product();

		p2.setPname("Mouse");
		//p2.setPrice(500.0);
		p2.setPrice(300.0);

		repository.save(p2);
*/
	}

}
