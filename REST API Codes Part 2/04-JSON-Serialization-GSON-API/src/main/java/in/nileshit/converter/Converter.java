package in.nileshit.converter;



import in.nileshit.Author;
import in.nileshit.Book;
import java.io.File; // Add this import statement
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class Converter {
	
	public static void main(String[] args) throws Exception {
		
		Author author = new Author();
		author.setAuthorName("Rod Johnson");
		author.setAuthorEmail("r.john@gmail.com");
		author.setAuthorPhno(86868686l);

		Book book = new Book();
		book.setId(101);
		book.setName("Spring");
		book.setPrice(450.00);
		book.setAuthor(author);
		
		
		Gson gson = new Gson();
		//String json = gson.toJson(book);
		String json = gson.toJson(book);
		System.out.println(json);
		
		Book bobj = gson.fromJson(new FileReader(new File("book.json")),Book.class);
		System.out.println(bobj);
	
	}

}
