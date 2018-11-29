package ayc.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ayc.didemo.services.GreetingService;

@Controller
public class PropertyInjectedController {
	@Autowired
	public GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
