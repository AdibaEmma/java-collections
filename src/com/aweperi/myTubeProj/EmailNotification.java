package com.aweperi.myTubeProj;

public class EmailNotification implements NotificationService {
    @Override
    public void notify(User user) {
        System.out.println("Sending notification");
        System.out.println("Notification sent to: " + user.getEmail());
    }
}
