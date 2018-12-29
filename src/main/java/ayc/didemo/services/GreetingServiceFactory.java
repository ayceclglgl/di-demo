package ayc.didemo.services;

public class GreetingServiceFactory {
	
	private GreetingRepository greetingRepository;
	
	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	
	public GreetingService createGreetingService(String profile) {
		switch (profile) {
		case "es":
			return new PrimarySpanishGreetingServiceImpl(greetingRepository);
		case "de":
			return new PrimaryGermanGreetingServiceImpl(greetingRepository);
		default:
			return new GreetingServiceImpl();
		}
	}
	
	
}
	