package in.nileshit.converter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.nileshit.Book;

public class JsonToJavaConverter  {
	
	public static void main(String[] args) throws Exception {
        
		/*File jsonFile = new File("book.json");

		ObjectMapper mapper = new ObjectMapper();

		Book book = mapper.readValue(jsonFile, Book.class);

		System.out.println(book);
		
         */
		
		ObjectMapper mapper = new ObjectMapper();
		Book book = mapper.readValue(new File("book.json"),Book.class);
		System.out.println(book);

	}

}
