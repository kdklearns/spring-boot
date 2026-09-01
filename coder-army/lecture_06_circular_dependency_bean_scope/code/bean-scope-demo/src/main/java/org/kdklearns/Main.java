package org.kdklearns;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order1 = new OrderService();
        OrderService order2 = new OrderService();

        System.out.println(order1 == order2);
    }
}