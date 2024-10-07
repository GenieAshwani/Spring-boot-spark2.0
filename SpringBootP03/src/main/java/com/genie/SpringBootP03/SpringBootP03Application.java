package com.genie.SpringBootP03;

import com.genie.SpringBootP03.beans.Flipkart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootP03Application {

	public static void main(String[] args) {


	ApplicationContext context= SpringApplication.run(SpringBootP03Application.class, args);
		Flipkart bean = context.getBean(Flipkart.class);
		bean.paymentGateWay("10000");

	}

}
