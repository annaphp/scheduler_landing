package online.sked.scheduler_landing.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping(value="/")
	public String mainPage() {
		return "landing_page";
	}

}
