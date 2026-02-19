package org.example.permittedppl.Repo;

import org.example.permittedppl.Entity.Audience;
import org.example.permittedppl.Entity.Performer;
import org.example.permittedppl.Entity.PermittedPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PermittedPersonRepository extends JpaRepository<PermittedPerson, String> {

    @Query("SELECT p FROM PermittedPerson p WHERE TYPE(p) = Performer")
    List<Performer> findAllPerformers();

    @Query("SELECT p FROM PermittedPerson p WHERE TYPE(p) = Audience")
    List<Audience> findAllAudience();
}
