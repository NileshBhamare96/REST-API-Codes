package in.nileshit.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoRestController {

	@GetMapping("/")
	public String m1() {
		System.out.println("m1(..) method excecuted)");
		String msg = "This is m1() method response";
		try {
			int i = 10 / 0;

		} catch (Exception e) {
			e.printStackTrace();
			msg = m2();
		}

		return msg;
	}

	public String m2() {
		System.out.println("m1(..) method excecuted)");
		String msg = "This is m2() method response";
		return msg;

	}

}
