package spring.projects.di.controllers;

import org.springframework.stereotype.Controller;
import spring.projects.di.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println(greetingService.greetings());
        return "Hello World!!! "+this.getClass().getSimpleName();
    }
}
