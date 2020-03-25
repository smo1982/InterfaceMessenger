package com.company;

public class Hotmail implements IMessenger {

    @Override
    public void sendMessage(String text) {
        System.out.println("hotmail: " + text);

    }

    @Override
    public void getMessage() {
        System.out.println("hotmail message");
    }
}
