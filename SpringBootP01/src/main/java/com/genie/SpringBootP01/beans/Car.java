package com.genie.SpringBootP01.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    IEngine eng;
   public void m1()
    {
        eng.start();
    }

}
