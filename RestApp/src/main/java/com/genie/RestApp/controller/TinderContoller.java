package com.genie.RestApp.controller;


import com.genie.RestApp.dto.Person;
import com.genie.RestApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class TinderContoller {


    @Autowired
    PersonService personService;


    @GetMapping("/getPersons")
    public List<Person> getAllPerson()
    {
        List<Person> allPersonData = personService.getAllPersonData();
        List<Person> filterData = personService.filterDataBasedOnGen(allPersonData);
        return filterData;
    }

    @PostMapping("/create-person")
    public Person createUser(@RequestBody Person person)
    {
        return person;
    }

    @DeleteMapping("/create-person")
    public Person deletUser(@RequestBody Person person)
    {
        return person;
    }

}
