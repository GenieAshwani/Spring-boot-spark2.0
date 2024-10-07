package com.genie.RestApp.service.impl;

import com.genie.RestApp.dto.Person;
import com.genie.RestApp.service.PersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PersonServiceImpl  implements PersonService {
    Person amit=new Person("Amit","delhi","M",23,"B.tech");
    Person sumit=new Person("Sumit","Bhopal","M",24,"BCA");
    Person neha=new Person("Neha","Pune","F",21,"MBA");
    Person ayushi=new Person("Ayushi","Hydrabad","F",23,"B.com");
    Person angle_priya=new Person("Angel Priya","Nagpur","F",26,"MCA");

    List<Person> personList=new ArrayList<>();

    @Value("${user.gender}")
    String userGender;
    @Override
    public List<Person> getAllPersonData() {
        personList.add(amit);
        personList.add(sumit);
        personList.add(neha);
        personList.add(ayushi);
        personList.add(angle_priya);
        return personList;
    }

    @Override
    public List<Person> filterDataBasedOnGen(List<Person> personList) {
        List<Person> per =new ArrayList<>();
        for(Person obj: personList)
        {
            if (!userGender.equalsIgnoreCase(obj.getGender()))
            {
                per.add(obj);
            }
        }
        return per;
    }
}
