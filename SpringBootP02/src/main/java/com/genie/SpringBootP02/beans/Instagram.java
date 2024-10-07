package com.genie.SpringBootP02.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Instagram {

    @Autowired
    Reels reels;

    @Autowired
    LocalDateTime localDateTime;

    public void play()
    {
        System.out.println("login at : "+localDateTime);
        reels.dance();
    }
}
