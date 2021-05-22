package com.company;

public abstract class User {
    protected ChatMediator chatMediator;
    protected String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);
}

class UserImpl extends User {
    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending Message = " + msg);
        chatMediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received Message: " + msg);
    }
}
