package narayan.components.https.enabler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlphaController {

	@GetMapping("/hello")
	public String hello_get() {
		return "hello get";
	}
	
	
	@PostMapping("/hello")
	public String hello_post() {
		return "hello post";
	}
}
