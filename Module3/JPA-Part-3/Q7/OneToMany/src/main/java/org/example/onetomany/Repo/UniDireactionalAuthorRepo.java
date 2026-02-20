package org.example.onetomany.Repo;

import org.example.onetomany.UnidirectionalEnity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniDireactionalAuthorRepo extends JpaRepository<Author,Long> {
}
