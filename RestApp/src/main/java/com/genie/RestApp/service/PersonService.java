package com.genie.RestApp.service;

import com.genie.RestApp.dto.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAllPersonData();

    List<Person> filterDataBasedOnGen(List<Person> personList);
}
