package in.nileshit.client;

import org.springframework.web.reactive.function.client.WebClient;

import in.nileshit.bindings.Book;

public class BookClient {

	// HTTP Post Request with WebClient
	public void invokeSaveBook() {

		Book book = new Book();
		book.setBookName("Angular");
		book.setBookPrice(450.00);

		String apiUrl = "https://ashokit-book-app.herokuapp.com/book";

		WebClient client = WebClient.create();

		String resp = client.post() // HTTP POST Request
				.uri(apiUrl) // End point URL
				.bodyValue(book) // HTTP Request Body Data
				.retrieve() // Retrieve HTTP Response Body
				.bodyToMono(String.class) // Bind Response to string var
				.block(); // Make it as Sync client

		System.out.println(resp);
	}

	// HTTP GET Request using WebClient

	public void invokeGetBooks() {

		/*
		 * String apiUrl = "https://ashokit-book-app.herokuapp.com/books"; WebClient
		 * client = WebClient.create();
		 * 
		 * 
		 * 
		 * String body = client.get() // GET Request .uri(apiUrl) // Endpoint URL
		 * .retrieve() // retrieve response body .bodyToMono(String.class) // bind
		 * response data to string var .block(); // make it sync
		 * 
		 * 
		 */

		String apiUrl = "https://ashokit-book-app.herokuapp.com/books";
		WebClient client = WebClient.create();

		Book[] responseData = client.get().uri(apiUrl).retrieve().bodyToMono(Book[].class).block();

		for (Book b : responseData) {
			System.out.println(b);
		}

	}

	// Asynchronus call using Webclient

	public void invokeGetBooksAsync() {
		String apiUrl = "https://ashokit-book-app.herokuapp.com/books";
		WebClient client = WebClient.create();

		client.get().uri(apiUrl).retrieve().bodyToMono(Book[].class).subscribe(BookClient::respHandler); // Async  Communication
																											

		System.out.println("**************Request Sent***********");
	}

	public static void respHandler(Book[] books) {
		for (Book b : books) {
			System.out.println(b);
		}
	}

}
