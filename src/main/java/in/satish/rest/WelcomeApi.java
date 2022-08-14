package in.satish.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeApi {
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg = "Welcome to SatIt Technology...!!";
		return msg;
	}
}
