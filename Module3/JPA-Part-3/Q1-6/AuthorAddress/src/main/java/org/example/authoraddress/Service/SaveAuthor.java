package org.example.authoraddress.Service;

import org.example.authoraddress.Entity.Author;
import org.example.authoraddress.Repo.AuthorRepo;
import org.springframework.stereotype.Service;

@Service
public class SaveAuthor {

    private final AuthorRepo authorRepo;

    public SaveAuthor(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

// Q4- Method to persist author
    public String addAuthor(Author author)
    {
        authorRepo.save(author);
        return("Author is saved ");

    }

}
