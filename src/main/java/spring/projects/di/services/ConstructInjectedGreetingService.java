package spring.projects.di.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructInjectedGreetingService implements GreetingService {

    @Override
    public String greetings() {
        return "Hello World!!! "+this.getClass().getSimpleName();
    }
}
