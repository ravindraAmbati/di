package spring.projects.di.controllers;

import spring.projects.di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public GreetingService getGreetingService() {
        return greetingService;
    }
}
