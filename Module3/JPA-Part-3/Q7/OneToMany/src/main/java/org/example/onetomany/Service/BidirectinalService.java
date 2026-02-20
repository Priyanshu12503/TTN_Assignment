package org.example.onetomany.Service;

import org.example.onetomany.BiDirectinalEnity.BiAuthor;
import org.example.onetomany.Repo.BidirectionalAuthorRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BidirectinalService {

    private final BidirectionalAuthorRepo bidirectionalAuthorRepo;

    public BidirectinalService(BidirectionalAuthorRepo bidirectionalAuthorRepo) {
        this.bidirectionalAuthorRepo = bidirectionalAuthorRepo;
    }

    public BiAuthor saveAuthor(BiAuthor biAuthor) {
        if (biAuthor.getBooks() != null) {
            biAuthor.getBooks().forEach(book -> book.setAuthor(biAuthor));
        }
        return bidirectionalAuthorRepo.save(biAuthor);
    }

    public List<BiAuthor> getAll() {
        return bidirectionalAuthorRepo.findAll();
    }
}
