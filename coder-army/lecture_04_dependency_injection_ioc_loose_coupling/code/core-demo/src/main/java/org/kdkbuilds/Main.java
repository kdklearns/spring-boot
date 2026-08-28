package org.kdkbuilds;

import org.kdkbuilds.notification.EmailNotificationService;
import org.kdkbuilds.notification.NotificationService;
import org.kdkbuilds.notification.PopUpNotificationService;
import org.kdkbuilds.notification.SmsNotificationService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choice: ");
        String userInput = scanner.nextLine().strip();
        int choice = Integer.parseInt(userInput);

        NotificationService notification = switch (choice) {
            case 1 -> new EmailNotificationService();
            case 2 -> new PopUpNotificationService();
            default -> new SmsNotificationService();
        };

        OrderService orderService = new OrderService(notification);
        orderService.placeOrder();
    }
}