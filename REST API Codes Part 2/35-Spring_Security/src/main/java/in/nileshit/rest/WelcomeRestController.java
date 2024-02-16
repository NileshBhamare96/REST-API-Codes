package in.nileshit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String Welcome()
	{
		String msg = "Welcome to NILESH IT" ;
		return msg ;
	}

}