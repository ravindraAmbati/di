package spring.projects.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.projects.di.services.ConstructInjectedGreetingService;

class ConstructInjectedControllerTest {
    private ConstructInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructInjectedController(new ConstructInjectedGreetingService());
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreetingService().greetings());
    }
}