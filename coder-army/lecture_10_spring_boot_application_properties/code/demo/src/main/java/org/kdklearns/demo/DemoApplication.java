package org.kdklearns.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
//		paymentGateway.setType("paytm");
//		paymentGateway.setRetryCount(5);

//		System.out.println(paymentGateway.getType() + " " + paymentGateway.getRetryCount()
//							+ " " + paymentGateway.getTimeout() + " " +paymentGateway.isEnabled());
	}

}
