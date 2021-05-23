package com.company;

public interface Observer {
    // Method to update the observer, used by subject
    public void update();

    // Attach with subject to observe, not required, but, added so that the
    // observer can query the subject to see if an update has occured
    public void setSubject(Subject sub);
}

class MyTopicSubscriber implements Observer {
    private String name;

    // Not required, could just pass subjects state to update method, but, also used to attach
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        // This method could take data of subjects state that was changed, do not need to ask topic for it
        String msg = (String) topic.getUpdate(this);
        if(msg == null)
            System.out.println(name + ":: No new message");
        else
            System.out.println(name + ":: Consuming message::" + msg);
    }

    @Override
    public void setSubject(Subject sub) {
        // Not required, added so observer can ask subject for state
        this.topic = sub;
    }
}
