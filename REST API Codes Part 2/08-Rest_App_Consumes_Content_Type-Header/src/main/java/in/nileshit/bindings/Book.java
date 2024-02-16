package in.nileshit.bindings;




import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Book {

	private Integer id;
	private String name;
	private Double price;

}

/* @Data
@XmlRootElement
public class Book {

	private Integer id;
	private String name;
	private Double price;

}*/