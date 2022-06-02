package com.chrisweb.designpatterns.behaviorals.command;

public class SetTopBox {
    public void on() {
        System.out.println("SetTopBox in on");

    }
    public void off() {
        System.out.println("SetTopBox in off");
    }

    public void setChannel(int defaultChannel) {
        System.out.println("SetTopBox in set to channel : " + defaultChannel);
    }

    public void setVolume(int volume) {
        System.out.println("SetTopBox volume is set to : " + volume);
    }
}
