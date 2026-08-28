package org.kdkbuilds;

import org.kdkbuilds.payment.CardPayment;
import org.kdkbuilds.payment.PaymentService;
import org.kdkbuilds.payment.UPIPayment;
import org.kdklearns.CartService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.kdkbuilds")
public class AppConfig {

    @Bean
    public User createUser() {
        return new User(26, "Keshav");
    }

    @Bean
    public CartService getCartService() {
        return new CartService();
    }

    @Bean
    @Qualifier
    public PaymentService createCardPaymentService() {
        return new CardPayment();
    }

    @Bean
    @Qualifier
    public PaymentService createUpiPaymentService() {
        return new UPIPayment();
    }

    @Bean
    public OrderService createOrderService(@Qualifier("createCardPaymentService") PaymentService paymentService) {
        return new OrderService(paymentService);
    }
}
