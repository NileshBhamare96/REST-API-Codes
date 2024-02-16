package in.nileshit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.nileshit.bindings.PassengerInfo;
import in.nileshit.bindings.TickitInfo;

@RestController
public class TickitBookingController {
	
	@PostMapping(value = "/booking", produces = {"application/json"} , consumes = {"application/json"} )
	public ResponseEntity<TickitInfo> booking(@RequestBody PassengerInfo pobj)
	{
		TickitInfo tobj = new TickitInfo();
		tobj.setTrainname("MahalaxmiExpress");
		tobj.setStatus("confirmed");
		tobj.setPobj(pobj);
		System.out.println("Happy Journry ");
		
		return new ResponseEntity<TickitInfo>(tobj,HttpStatus.OK);
	}

}


/*
 * {
   "id": 101,
   "name": "Nilesh",
   "gender": "male"
}  */

