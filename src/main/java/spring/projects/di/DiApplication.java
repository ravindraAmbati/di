package spring.projects.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import spring.projects.di.controllers.MyController;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DiApplication.class, args);
		MyController bean = context.getBean("myController", MyController.class);
		String greetings = bean.sayHello();
		System.out.println(greetings);
	}

}
