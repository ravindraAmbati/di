package spring.projects.di.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String greetings() {
        return "Hello World!!! "+this.getClass().getSimpleName();
    }
}
