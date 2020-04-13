package spring.projects.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import spring.projects.di.controllers.ConstructInjectedController;
import spring.projects.di.controllers.MyController;
import spring.projects.di.controllers.PropertyInjectedController;
import spring.projects.di.controllers.SetterInjectedController;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DiApplication.class, args);

		System.out.println("-------------------------");
		System.out.println(MyController.class.getSimpleName());
		MyController beanMyController = context.getBean("myController", MyController.class);
		System.out.println(beanMyController.sayHello());

		System.out.println("-------------------------");
		System.out.println(PropertyInjectedController.class.getSimpleName());

		//@Autowired for property
		PropertyInjectedController beanPropertyInjectedController = context.getBean("propertyInjectedController",PropertyInjectedController.class);
		System.out.println(beanPropertyInjectedController.getGreetingService().greetings());

		System.out.println("-------------------------");
		System.out.println(SetterInjectedController.class.getSimpleName());

		//@Autowired for setter
		SetterInjectedController beanSetterInjectedController = context.getBean("setterInjectedController",SetterInjectedController.class);
		System.out.println(beanSetterInjectedController.getGreetingService().greetings());

		System.out.println("-------------------------");
		System.out.println(ConstructInjectedController.class.getSimpleName());

		//@Autowired is not required for construct
		ConstructInjectedController beanConstructInjectedController = context.getBean("constructInjectedController",ConstructInjectedController.class);
		System.out.println(beanConstructInjectedController.getGreetingService().greetings());
	}

}
