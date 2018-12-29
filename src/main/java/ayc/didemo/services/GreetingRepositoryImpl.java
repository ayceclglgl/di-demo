package ayc.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getSpanishGreeting() {
		return "Hello from getSpanishGreeting-GreetingRepositoryImpl";//sayGreeting-PrimarySpanishGreetingServiceImpl";
	}

	@Override
	public String getGermanGreeting() {
		return "Hello from getGermanGreeting-GreetingRepositoryImpl";//sayGreeting - PrimaryGermanGreetingServiceImpl";
	}

}
