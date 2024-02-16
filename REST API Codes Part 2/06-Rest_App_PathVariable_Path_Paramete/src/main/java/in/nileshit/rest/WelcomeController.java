package in.nileshit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    
	//http://localhost:8080/book/MoneyHest
	@GetMapping("/book/{name}")
	public ResponseEntity getBookPrice(@PathVariable("name") String name) {
		String payLoad = name + " Price is 400$";
		return new ResponseEntity<>(payLoad, HttpStatus.OK);
	}
	
	@GetMapping("/bookstore/name/{book}/author/{author}")
	public ResponseEntity<String> getAuthor(@PathVariable("book")String book , @PathVariable("author") String author)
	{
		String payLoad = book + " is by "+author+ " is in stock ...." ;
		return new ResponseEntity<>(payLoad, HttpStatus.OK);
	
	}
	
	
}



