package org.example.permittedppl.Service;

import org.example.permittedppl.Entity.Audience;
import org.example.permittedppl.Entity.Performer;
import org.example.permittedppl.Entity.PermittedPerson;
import org.example.permittedppl.Repo.PermittedPersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermittedPersonService {

    private final PermittedPersonRepository permittedPersonRepository;

    public PermittedPersonService(PermittedPersonRepository permittedPersonRepository) {
        this.permittedPersonRepository = permittedPersonRepository;
    }

    public Performer addPerformer(Performer performer) {
        return permittedPersonRepository.save(performer);
    }

    public Audience addAudience(Audience audience) {
        return permittedPersonRepository.save(audience);
    }

    public List<Performer> getAllPerformers() {
        return permittedPersonRepository.findAllPerformers();
    }

    public List<Audience> getAllAudience() {
        return permittedPersonRepository.findAllAudience();
    }

    public List<PermittedPerson> getAllPeople() {
        return permittedPersonRepository.findAll();
    }
}
