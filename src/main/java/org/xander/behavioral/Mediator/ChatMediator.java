package org.xander.behavioral.Mediator;

public interface ChatMediator {

    void sendMessage(String msg, User user);

    void addUser(User user);
}