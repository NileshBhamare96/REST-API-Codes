package in.nileshit.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nileshit.bindings.Booking;
import in.nileshit.bindings.TickitInfo;

@RestController
public class BookingController {

	@PostMapping(value = "/bookmyshow", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<TickitInfo> getTickit(@RequestBody Booking booking) {
		TickitInfo tobj = new TickitInfo();
		tobj.setIt("confirmed");
		tobj.setDate(LocalDate.now());
		return new ResponseEntity<>(tobj, HttpStatus.OK);Moviename(booking.getMoviename());
		tobj.setTheaterename(booking.getTheaterename());
		tobj.setShowtime(booking.getShowtime());
		tobj.setPrice(250.00);
		tobj.setStatus("tickt")
	}
}
