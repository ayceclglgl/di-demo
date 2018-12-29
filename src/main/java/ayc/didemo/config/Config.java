package ayc.didemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import ayc.didemo.beans.MyController;
import ayc.didemo.services.GreetingRepository;
import ayc.didemo.services.GreetingService;
import ayc.didemo.services.GreetingServiceFactory;

@Configuration
public class Config {

	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
		return new GreetingServiceFactory(repository);
	}
	
	@Bean
	MyController myController() {
		return new MyController();
	}

	@Bean
	@Primary
	@Profile("es")
	public GreetingService primarySpanishGreetingServiceImpl(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("es");
	}

	@Bean
	@Primary
	@Profile("de")
	public GreetingService primaryGermanGreetingServiceImpl(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("de");
	}

}
