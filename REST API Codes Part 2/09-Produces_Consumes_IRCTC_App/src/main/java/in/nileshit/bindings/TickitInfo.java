package in.nileshit.bindings;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class TickitInfo {
	
	private String trainname ;
	private String status ;
	
	@Autowired
	private PassengerInfo pobj ;
}
