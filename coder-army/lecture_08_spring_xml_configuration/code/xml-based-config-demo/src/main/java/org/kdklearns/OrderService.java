package org.kdklearns;

public class OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void place() {
        paymentService.pay();
        System.out.println("Order placed");
    }
}
