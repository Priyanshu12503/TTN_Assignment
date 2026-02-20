package org.example.onetomany.Controller;

import org.example.onetomany.Service.UnidirectionalService;
import org.example.onetomany.UnidirectionalEnity.Author;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uni")
public class UnidirectinalController {

    private final UnidirectionalService unidirectionalService;

    public UnidirectinalController(UnidirectionalService unidirectionalService) {
        this.unidirectionalService = unidirectionalService;
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return unidirectionalService.saveAuthor(author);
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return unidirectionalService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable Long id) {
        return unidirectionalService.getAuthor(id);
    }
}
