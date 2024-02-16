package in.nileshit.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	private Integer  bookID ;
	private String bookName ;
	private Double bookPrice ;

}
