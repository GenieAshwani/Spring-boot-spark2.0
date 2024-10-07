package com.genie.SpringBootP01.beans;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Petrol implements IEngine {

    Petrol()
    {
        System.out.println("Petrol class started....");
    }
    public void start()
    {
        System.out.println("Petrol car started....");
    }
}
