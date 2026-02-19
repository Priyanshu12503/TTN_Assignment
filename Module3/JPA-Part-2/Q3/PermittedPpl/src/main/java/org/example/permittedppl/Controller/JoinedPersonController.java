package org.example.permittedppl.Controller;

import org.example.permittedppl.JoinedEntity.JoinedPerson;
import org.example.permittedppl.Service.JoinedPersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//Q3 -(2) Implement and demonstrate Joined strategy.

@RestController
@RequestMapping("/joined")
public class JoinedPersonController {

    private final JoinedPersonService joinedPersonService;

    public JoinedPersonController(JoinedPersonService joinedPersonService) {
        this.joinedPersonService = joinedPersonService;
    }

    @PostMapping("/save")
    public JoinedPerson save(@RequestBody JoinedPerson person) {
        return joinedPersonService.savePerson(person);
    }

    @GetMapping("/all")
    public List<JoinedPerson> getAll() {
        return joinedPersonService.getAllPersons();
    }
}