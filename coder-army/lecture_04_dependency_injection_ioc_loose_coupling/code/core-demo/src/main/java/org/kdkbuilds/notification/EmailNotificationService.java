package org.kdkbuilds.notification;

public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Email notification sent");
    }
}
