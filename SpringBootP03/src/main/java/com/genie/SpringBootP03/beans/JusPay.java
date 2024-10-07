package com.genie.SpringBootP03.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class JusPay implements Paterns{

    JusPay()
    {
        System.out.println("JusPay constructor...");
    }
    @Override
    public void payment(String amount) {

        System.out.println("JusPay payment done for = "+amount);

    }
}
