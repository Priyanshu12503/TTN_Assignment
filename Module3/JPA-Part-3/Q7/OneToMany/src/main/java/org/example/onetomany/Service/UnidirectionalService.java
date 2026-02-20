package org.example.onetomany.Service;

import org.example.onetomany.Repo.UniDireactionalAuthorRepo;
import org.example.onetomany.UnidirectionalEnity.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidirectionalService {

    private final UniDireactionalAuthorRepo uniDireactionalAuthorRepo;

    public UnidirectionalService(UniDireactionalAuthorRepo uniDireactionalAuthorRepo) {
        this.uniDireactionalAuthorRepo = uniDireactionalAuthorRepo;
    }

    public Author saveAuthor(Author author) {
        return uniDireactionalAuthorRepo.save(author);
    }

    public List<Author> getAllAuthors() {
        return uniDireactionalAuthorRepo.findAll();
    }

    public Author getAuthor(Long id) {
        return uniDireactionalAuthorRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Author not found"));
    }
}
