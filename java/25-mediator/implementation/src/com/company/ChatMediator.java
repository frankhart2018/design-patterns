package com.company;

import java.util.ArrayList;
import java.util.List;

public interface ChatMediator {
    public void sendMessage(String msg, User user);
    void addUser(User user);
}

class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<User>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u: users) {
            // Message should not be received by the user sending it
            if(u != user) {
                u.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
