package spring.projects.di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    private String initBy;


    @Override
    public String greetings() {
        return "Hello World!!! "+this.getClass().getSimpleName();
    }
}
