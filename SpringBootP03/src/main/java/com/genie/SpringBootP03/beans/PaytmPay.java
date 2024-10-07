package com.genie.SpringBootP03.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PaytmPay implements Paterns{

    PaytmPay()
    {
        System.out.println("PaytmPay constructor...");
    }
    @Override
    public void payment(String amount) {
        System.out.println("PaytmPay payment done for = "+amount);
    }
}
