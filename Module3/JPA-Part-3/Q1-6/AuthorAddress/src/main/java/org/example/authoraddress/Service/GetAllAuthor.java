package org.example.authoraddress.Service;

import org.example.authoraddress.Entity.Author;
import org.example.authoraddress.Repo.AuthorRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllAuthor {

    private final AuthorRepo authorRepo;


    public GetAllAuthor(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public List<Author> getAll()
    {
        return authorRepo.findAll();
    }
}
