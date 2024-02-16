package in.nileshit.bindings;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Address {
	
	private String city;
	private String state;
	private String country;

}
