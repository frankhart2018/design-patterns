package com.company;

// Contains collection of notifications as an object of NotificationCollection
public class NotificationBar {
    NotificationCollection notificationCollection;

    public NotificationBar(NotificationCollection notificationCollection) {
        this.notificationCollection = notificationCollection;
    }

    public void printNotifications() {
        Iterator iterator = notificationCollection.createIterator();
        System.out.println("----------NOTIFICIATIONS BAR----------");
        while (iterator.hasNext()) {
            Notification notification = (Notification) iterator.next();
            System.out.println(notification.getNotification());
        }
    }
}
