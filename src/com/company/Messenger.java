package com.company;

public class Messenger {
    public void sendCode(IMessenger messenger, String text) {
        messenger.sendMessage(text);
    }


    public void getCode(IMessenger messenger) {
        messenger.getMessage();
    }
}
