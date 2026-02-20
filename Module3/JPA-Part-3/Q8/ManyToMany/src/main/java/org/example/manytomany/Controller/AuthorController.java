package org.example.manytomany.Controller;

import org.example.manytomany.Entity.Author;
import org.example.manytomany.Service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public Author saveAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }

    @GetMapping
    public List<Author> getAll() {
        return authorService.getAllAuthors();
    }
}