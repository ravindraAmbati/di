package spring.projects.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("TG")
@Service("i18nGreetingService")
public class I18nTeluguGreetingService implements GreetingService {
    @Override
    public String greetings() {
        return "Namaste "+this.getClass().getSimpleName();
    }
}
