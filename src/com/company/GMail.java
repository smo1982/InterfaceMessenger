package com.company;

public class GMail implements IMessenger {
    @Override
    public void sendMessage(String text) {
        System.out.println("gmail: " + text);
    }

    @Override
    public void getMessage() {
        System.out.println("gmail message");
    }
}
