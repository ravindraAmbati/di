package spring.projects.di.services;

public class GreetingServiceImpl implements GreetingService {

    private String initBy;

    public GreetingServiceImpl(String initBy){
        this.initBy = initBy;
    }

    @Override
    public String greetings() {
        return "Hello World!!! "+this.getClass().getSimpleName()+" is initialized by "+initBy;
    }
}
