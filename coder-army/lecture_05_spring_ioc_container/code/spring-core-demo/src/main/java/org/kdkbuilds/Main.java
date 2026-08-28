package org.kdkbuilds;

import org.kdklearns.CartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Java Reflection API
        Class<?> c1 = Student.class;
        System.out.println(c1);

        // Creating the Spring IoC Container
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

        // Using a local external dependency
        CartService cart = new CartService();
        cart.addToCart();

        // Using beans created from custom implementation
        User user = context.getBean(User.class);
        System.out.println("User name: " + user.getName() + ", age: " + user.getAge());

        CartService cartService = context.getBean(CartService.class);
        cartService.addToCart();
    }
}