package spring.projects.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("HN")
@Service("i18nGreetingService")
public class I18nHindiGreetingService implements GreetingService {
    @Override
    public String greetings() {
        return "Namaskar "+this.getClass().getSimpleName();
    }
}
