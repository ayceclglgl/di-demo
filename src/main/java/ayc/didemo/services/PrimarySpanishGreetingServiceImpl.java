package ayc.didemo.services;

public class PrimarySpanishGreetingServiceImpl implements GreetingService{
	private GreetingRepository greetingRepository;

	public PrimarySpanishGreetingServiceImpl(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	
	@Override
	public String sayGreeting() {
		return greetingRepository.getSpanishGreeting();
		//return "Hello from sayGreeting-PrimarySpanishGreetingServiceImpl";
	}

}
