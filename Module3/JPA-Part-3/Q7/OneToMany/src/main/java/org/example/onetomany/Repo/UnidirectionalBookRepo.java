package org.example.onetomany.Repo;

import org.example.onetomany.UnidirectionalEnity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidirectionalBookRepo extends JpaRepository<Book,Long> {
}
