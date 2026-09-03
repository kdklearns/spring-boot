package org.kdklearns;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");

        OrderService orderService = context.getBean("orderService", OrderService.class);
        orderService.place();

        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.getUsernames());

        context.close();
    }
}
