package spring.projects.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.projects.di.services.ConstructInjectedGreetingService;

class SetterInjectedControllerTest {
    private SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructInjectedGreetingService());
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreetingService().greetings());
    }
}