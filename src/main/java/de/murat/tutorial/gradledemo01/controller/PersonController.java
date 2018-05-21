package de.murat.tutorial.gradledemo01.controller;


import de.murat.tutorial.gradledemo01.model.Person;
import de.murat.tutorial.gradledemo01.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private IPersonService personService;


    @RequestMapping(value = "/persons", method = RequestMethod.GET, produces = { "application/json"}, consumes = {"application/json"})
    public List<Person> getAllPersons() {
        List<Person> result = personService.getAllPersons();
        System.out.println("Result: " + result.size());
        return result;
    }
}

