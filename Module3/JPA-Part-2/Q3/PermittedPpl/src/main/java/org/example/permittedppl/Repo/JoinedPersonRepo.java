package org.example.permittedppl.Repo;



import org.example.permittedppl.JoinedEntity.JoinedPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoinedPersonRepo extends JpaRepository<JoinedPerson, String> {
}
