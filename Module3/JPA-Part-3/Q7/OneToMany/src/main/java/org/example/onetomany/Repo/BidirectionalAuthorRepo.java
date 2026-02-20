package org.example.onetomany.Repo;

import org.example.onetomany.BiDirectinalEnity.BiAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidirectionalAuthorRepo extends JpaRepository<BiAuthor,Long> {
}
