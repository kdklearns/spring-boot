package org.kdkbuilds.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component
// @Qualifier("upi")
public class UPIPayment implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Paying via UPI");
    }
}
