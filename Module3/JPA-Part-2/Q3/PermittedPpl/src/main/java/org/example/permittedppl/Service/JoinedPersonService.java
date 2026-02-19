package org.example.permittedppl.Service;

import org.example.permittedppl.JoinedEntity.JoinedPerson;
import org.example.permittedppl.Repo.JoinedPersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoinedPersonService {

    private final JoinedPersonRepo joinedPersonRepo;

    public JoinedPersonService(JoinedPersonRepo joinedPersonRepo) {
        this.joinedPersonRepo = joinedPersonRepo;
    }

    public JoinedPerson savePerson(JoinedPerson person) {
        return joinedPersonRepo.save(person);
    }

    public List<JoinedPerson> getAllPersons() {
        return joinedPersonRepo.findAll();
    }
}
