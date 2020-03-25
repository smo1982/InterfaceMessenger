package com.company;

public class Main {

    public static void main(String[] args) {
	WhatsApp whatsApp = new WhatsApp();
	Slack slack = new Slack();
	GMail gMail = new GMail();
	Hotmail hotmail = new Hotmail();

    Messenger messenger = new Messenger();

    String text = "Hallo World!";

    messenger.sendCode(whatsApp, text);
    messenger.sendCode(slack, text);
    messenger.sendCode(gMail, text);
    messenger.sendCode(hotmail,text);

    messenger.getCode(whatsApp);
    messenger.getCode(slack);
    messenger.getCode(gMail);
    messenger.getCode(hotmail);

    }
}
