package in.nileshit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping(value = "/welcome")
	public ResponseEntity<String> getWelcomeMsg(@RequestParam("name") String name )
	{
		String payLoad = name + " Welcome to Nilesh It" ;
		return new ResponseEntity<>(payLoad ,HttpStatus.OK);
	}
	//http://localhost:8080/welcome?name=Raju
	
	@GetMapping(value = "/greet")
	public ResponseEntity<String> getWelcomeMsg(@RequestParam("name1") String name1 ,@RequestParam("name2") String name2)
	{
		String payLoad = name1 + " Good Morning " + name2 + " Good Evening" ;
		return new ResponseEntity<>(payLoad ,HttpStatus.OK);
	}
    
	//http://localhost:8080/greet?name1=Nilesh&name2=Ganesh

}
