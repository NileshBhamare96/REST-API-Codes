package in.nileshit.bindings;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Data
public class TickitInfo {

	private String moviename;
	private String theaterename;
	private String showtime;
	private Double price;
	private String status;
	private  LocalDate date ;

}
