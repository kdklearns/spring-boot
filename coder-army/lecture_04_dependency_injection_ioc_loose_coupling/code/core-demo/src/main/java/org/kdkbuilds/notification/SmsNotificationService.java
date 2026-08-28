package org.kdkbuilds.notification;

public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("SMS notification sent");
    }
}
