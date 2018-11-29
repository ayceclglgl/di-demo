package ayc.didemo.controllers;

import org.springframework.stereotype.Controller;

import ayc.didemo.services.GreetingService;

@Controller
public class PrimaryConstructorInjectedController {

	private GreetingService greetingService;

	public PrimaryConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
