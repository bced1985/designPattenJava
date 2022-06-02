package com.chrisweb.designpatterns.behaviorals.command;

public class MainCommand {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        SetTopBox setTopBox = new SetTopBox();
        Tv tv = new Tv();

        remote.setCommand(new SetTopBoxOnCommand(setTopBox));
        remote.pressButton();

        remote.setCommand(new TvOnCommand(tv));
        remote.pressButton();

        remote.setCommand(new SetTopBoxOffCommand(setTopBox));
        remote.pressButton();

        remote.setCommand(new TvOffCommand(tv));
        remote.pressButton();
    }
}
