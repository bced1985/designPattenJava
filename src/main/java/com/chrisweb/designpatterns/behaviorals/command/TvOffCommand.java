package com.chrisweb.designpatterns.behaviorals.command;

public class TvOffCommand implements Command{
    Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
