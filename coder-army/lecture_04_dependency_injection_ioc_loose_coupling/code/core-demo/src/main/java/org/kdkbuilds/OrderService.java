package org.kdkbuilds;

import org.kdkbuilds.notification.NotificationService;

public class OrderService {

    private NotificationService notification;

    public OrderService(NotificationService notification) {
        this.notification = notification;
    }
    public void placeOrder() {
        System.out.println("order has been placed");
        notification.sendNotification();
    }
}
