package de.murat.tutorial.gradledemo01.service;

import de.murat.tutorial.gradledemo01.model.Person;

import java.util.List;


public interface IPersonService {
    Person getPersonByFirstName(String firstName);
    List<Person> getAllPersons();
}
