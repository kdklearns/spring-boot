package org.kdkbuilds;

import org.kdkbuilds.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component
public class OrderService {

//    Field Injection
//    @Autowired
//    private PaymentService paymentService;

    private final PaymentService paymentService;

//  Constructor Injection
    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

//    Setter Injection
//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder() {
        paymentService.pay();
        System.out.println("Order placed");
    }
}
