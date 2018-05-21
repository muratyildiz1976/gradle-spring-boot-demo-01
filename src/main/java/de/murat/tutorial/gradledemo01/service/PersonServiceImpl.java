package de.murat.tutorial.gradledemo01.service;

import de.murat.tutorial.gradledemo01.model.Person;
import de.murat.tutorial.gradledemo01.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person getPersonByFirstName(String firstName) {
        return personRepository.findByFirstName(firstName);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
