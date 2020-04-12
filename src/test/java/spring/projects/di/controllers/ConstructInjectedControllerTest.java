package spring.projects.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.projects.di.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstructInjectedControllerTest {
    private ConstructInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructInjectedController(new GreetingServiceImpl(this.getClass().getSimpleName()));
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreetingService().greetings());
    }
}