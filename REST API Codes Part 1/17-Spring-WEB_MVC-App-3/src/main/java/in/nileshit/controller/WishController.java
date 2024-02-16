package in.nileshit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WishController {

	@GetMapping("/wish")
	@ResponseBody
	public String getWish() {
		String msg = "All the Best...!!!";
		return msg;
	}

}
