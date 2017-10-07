package ca.chaneric.website.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "index";
	}
	
	@RequestMapping("/wedding")
	public String wedding() {
		return "wedding";
	}
	
	
	@RequestMapping("/health")
	public String health(Map<String, Object> model) {
		model.put("message", this.message);
		return "health";
	}


}