package com.company;

public class Main {

    public static void main(String[] args) {
        // Create subject
        MyTopic myTopic = new MyTopic();

        // Create observers
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");

        // Register observers to the subject, could have added the registration as part of the observer constructor
        // (passing in the subject)
        myTopic.register(obj1);
        myTopic.register(obj2);
        myTopic.register(obj3);

        // Attach observer to subject (not required, could have passed in subject state to update method of observer)
        obj1.setSubject(myTopic);
        obj2.setSubject(myTopic);
        obj3.setSubject(myTopic);

        // Check if any update is available, not required
        obj1.update();

        // Now send message to subject, trigger notifyAll
        myTopic.postMessage("New Message");
    }
}
