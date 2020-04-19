package spring.projects.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import spring.projects.di.controllers.*;
import spring.projects.di.examplebeans.DataSource;
import spring.projects.di.services.CustomBeanPostProcessor;
import spring.projects.di.services.LifeCycleDemoBean;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DiApplication.class, args);

		System.out.println("-------------------------");
		System.out.println(LifeCycleDemoBean.class.getSimpleName());
		context.getBean("lifeCycleDemoBean", LifeCycleDemoBean.class);

		System.out.println("-------------------------");
		System.out.println(CustomBeanPostProcessor.class.getSimpleName());
		context.getBean("customBeanPostProcessor", CustomBeanPostProcessor.class);


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

		System.out.println("-------------------------");
		System.out.println(I18nController.class.getSimpleName());

		I18nController beanI18nController = context.getBean("i18nController", I18nController.class);
		System.out.println(beanI18nController.sayHello());

		System.out.println("-------------------------");
		System.out.println(PetController.class.getSimpleName());

		PetController beanPetController = context.getBean("petController", PetController.class);
		System.out.println(beanPetController.getPetType());

		System.out.println("-------------------------");
		System.out.println(DataSource.class.getSimpleName());

		DataSource beanDataSource = context.getBean(DataSource.class);
		System.out.println(beanDataSource.toString());


	}

}
