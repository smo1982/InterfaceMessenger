package com.company;

public class Slack implements IMessenger {
    @Override
    public void sendMessage(String text) {
        System.out.println("slack: " + text);
    }

    @Override
    public void getMessage() {
        System.out.println("slack message");
    }
}
