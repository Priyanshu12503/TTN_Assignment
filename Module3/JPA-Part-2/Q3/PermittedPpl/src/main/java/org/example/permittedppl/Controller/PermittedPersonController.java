package org.example.permittedppl.Controller;

import org.example.permittedppl.Entity.Audience;
import org.example.permittedppl.Entity.Performer;
import org.example.permittedppl.Entity.PermittedPerson;
import org.example.permittedppl.Service.PermittedPersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Q3 (1) - Demostrated single table inheritence using Permitted person as parent class with Performer and Audience as child calsses;



@RestController
@RequestMapping("/person")
public class PermittedPersonController {

    private final PermittedPersonService permittedPersonService;

    public PermittedPersonController(PermittedPersonService permittedPersonService) {
        this.permittedPersonService = permittedPersonService;
    }

    @PostMapping("/performer")
    public Performer addPerformer(@RequestBody Performer performer) {
        return permittedPersonService.addPerformer(performer);
    }

    @PostMapping("/audience")
    public Audience addAudience(@RequestBody Audience audience) {
        return permittedPersonService.addAudience(audience);
    }

    @GetMapping("/performers")
    public List<Performer> getPerformers() {
        return permittedPersonService.getAllPerformers();
    }

    @GetMapping("/audience")
    public List<Audience> getAudience() {
        return permittedPersonService.getAllAudience();
    }

    @GetMapping("/all")
    public List<PermittedPerson> getAll() {
        return permittedPersonService.getAllPeople();
    }
}
