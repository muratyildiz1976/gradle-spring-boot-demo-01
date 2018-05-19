package de.murat.tutorial.gradledemo01.repository;

import de.murat.tutorial.gradledemo01.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
