package org.kdklearns;

public class PaymentService {

    private final String type;
    private final int retryCount;

    public PaymentService(String type, int retryCount) {
        this.type = type;
        this.retryCount = 3;
    }

    public void pay() {
        System.out.println("Payment success through : " + type + " with " + retryCount + " retries");
    }
}
