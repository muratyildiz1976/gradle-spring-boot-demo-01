package de.murat.tutorial.gradledemo01.service;

import de.murat.tutorial.gradledemo01.model.Person;


public interface IPersonService {
    Person getPersonByFirstName(String firstName);
}
