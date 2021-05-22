package com.company;

public class NotificationIterator implements Iterator {
    Notification[] notificationList;

    // Maintains a current position of iterator over the array
    int pos = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        return pos < notificationList.length && notificationList[pos] != null;
    }

    @Override
    public Object next() {
        // Return next element in the array and increment pos
        Notification notification = notificationList[pos];
        pos++;
        return notification;
    }
}
