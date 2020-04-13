package spring.projects.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.projects.di.common.Language;

@Profile({"EN","default"})
@Service("i18nGreetingService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String greetings() {
        return "Hello "+this.getClass().getSimpleName();
    }
}
