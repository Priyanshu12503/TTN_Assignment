package org.example.authoraddress.Controller;

import org.example.authoraddress.Entity.Author;
import org.example.authoraddress.Repo.AuthorRepo;
import org.example.authoraddress.Service.GetAllAuthor;
import org.example.authoraddress.Service.SaveAuthor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    private final GetAllAuthor getAllAuthor;
    private final SaveAuthor saveAuthor;

    public AuthorController(GetAllAuthor getAllAuthor, SaveAuthor saveAuthor) {
        this.getAllAuthor = getAllAuthor;
        this.saveAuthor = saveAuthor;
    }

    @PostMapping
    public String saveAuthor(@RequestBody Author author)
    {
         return  saveAuthor.addAuthor(author);
    }


}
