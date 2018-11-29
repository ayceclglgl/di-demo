package ayc.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		return "hello from sayGreeting-GetterGreetingServiceImpl";
	}

}
