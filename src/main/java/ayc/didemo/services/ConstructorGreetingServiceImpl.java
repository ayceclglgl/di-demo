package ayc.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		return "hello from sayGreeting-ConstructorGreetingServiceImpl";
	}

}
