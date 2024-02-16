package in.nileshit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-API")
public interface WelcomeClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeApi();

}
