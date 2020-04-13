package spring.projects.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.projects.di.services.GreetingService;

@Controller
public class ConstructInjectedController {

    private final GreetingService greetingService;

    //Autowired is not required if we have construct
    public ConstructInjectedController(@Qualifier("constructInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
