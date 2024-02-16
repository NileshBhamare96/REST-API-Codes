package in.nileshit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping(value = "/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		String payLoad = "Welcome to Nilesh_It";

		return new ResponseEntity<>(payLoad, HttpStatus.OK);
	}

	@GetMapping(value = "/greet")
	public String getWelcomeGreet() {
		String payLoad = "Good Morning Nilesh....!!!";
		return payLoad;
	}

}
