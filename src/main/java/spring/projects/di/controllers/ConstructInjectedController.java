package spring.projects.di.controllers;

import spring.projects.di.services.GreetingService;

public class ConstructInjectedController {

    private final GreetingService greetingService;

    public ConstructInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
