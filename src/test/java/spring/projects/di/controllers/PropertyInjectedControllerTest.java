package spring.projects.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.projects.di.services.ConstructInjectedGreetingService;

class PropertyInjectedControllerTest {
    private PropertyInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructInjectedGreetingService();
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreetingService().greetings());
    }
}