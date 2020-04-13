package spring.projects.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service("petService")
public class CatService implements PetService {
    @Override
    public String getPetType() {
        return "Cat "+this.getClass().getSimpleName();
    }
}
