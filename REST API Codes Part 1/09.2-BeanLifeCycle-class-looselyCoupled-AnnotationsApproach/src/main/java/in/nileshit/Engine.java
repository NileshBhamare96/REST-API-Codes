package in.nileshit;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine {

	public Engine() {
		System.out.println(" Engine :: Constructor");
	}

	// you can give any names to method

	@PostConstruct
	public void init() {
		System.out.println(" init() method called...");
	}

	@PreDestroy
	public void destroy() {
		System.out.println(" destroy() method called...");
	}

}
