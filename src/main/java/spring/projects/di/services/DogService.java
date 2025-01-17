package spring.projects.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog","default"})
@Service("petService")
public class DogService implements PetService {
    @Override
    public String getPetType() {
        return "Dog "+this.getClass().getSimpleName();
    }
}
