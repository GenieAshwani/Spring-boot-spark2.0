package com.genie.SpringBootP03.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class RozerPay implements Paterns{

    RozerPay()
    {
        System.out.println("RozerPay constructor...");
    }
    @Override
    public void payment(String amount) {
        System.out.println("RozerPay payment done for = "+amount);
    }
}
