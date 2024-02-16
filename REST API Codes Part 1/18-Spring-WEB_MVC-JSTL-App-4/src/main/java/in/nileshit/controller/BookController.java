package in.nileshit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.nileshit.bindings.Book;

@Controller
public class BookController {
	
	@GetMapping("/bookstore")
	public String getBookDetails(Model model)
	{   
		//setting data to binding object
		Book book1 = new Book(101,"SpringBoot", 250.00);
		Book book2 = new Book(102,"Hibernate", 250.00);
		Book book3 = new Book(103,"Data JPA", 250.00);
		Book book4 = new Book(104,"Spring Core", 250.00);
		Book book5 = new Book(105,"Spring Cloud", 250.00);
		
		//adding data to model object to send to UI
		List<Book> booklist = Arrays.asList(book1 , book2 ,book3 ,book4 ,book5);
		model.addAttribute("books",booklist);
	    
	    //return view name
		return "nileshbook" ;
	}

}


