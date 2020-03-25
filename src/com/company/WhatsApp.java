package com.company;

public class WhatsApp implements IMessenger {
    @Override
    public void sendMessage(String text) {
        System.out.println("whatsapp: " + text);
    }

    @Override
    public void getMessage() {
        System.out.println("whatsapp message");

    }
}
