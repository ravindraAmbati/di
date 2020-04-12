package spring.projects.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.projects.di.services.GreetingService;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
