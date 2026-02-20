package org.example.manytomany.Service;

import org.example.manytomany.Entity.Author;
import org.example.manytomany.Repo.AuthorRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }


    public Author saveAuthor(Author author) {
        return authorRepo.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepo.findAll();
    }
}
