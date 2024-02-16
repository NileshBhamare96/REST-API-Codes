package in.nileshit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.nileshit.bindings.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public String getBookDetails(Model model)
	{
		Book bobj = new Book(101,"SPRINGBOOT", 250.00);
		model.addAttribute("msg", bobj) ;
		return "book" ;
	}

}


