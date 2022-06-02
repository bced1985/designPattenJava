package com.chrisweb.designpatterns.behaviorals.observer;

public class Mail {

    private String receiverName;
    private String address;
    String content;

    public Mail(String name, String address, String content) {
        this.receiverName = name;
        this.address = address;
        this.content = content;
    }

    public String getReceiverName() {return this.receiverName;}

    public String getContent() {
        return this.content;
    }
}
