package ayc.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ayc.didemo.controllers.ConstructorInjectedController;
import ayc.didemo.controllers.MyController;
import ayc.didemo.controllers.PropertyInjectedController;
import ayc.didemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {
	public static void main(String[] args) {
		//Spring Context Demo
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
		MyController myController = (MyController) context.getBean("myController");
		myController.hello();
		context.getBean(MyController.class).hello();
		
		//DI demo
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(SetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
		
	
	}
}
