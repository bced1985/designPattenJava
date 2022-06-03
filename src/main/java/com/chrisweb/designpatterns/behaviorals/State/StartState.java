package com.chrisweb.designpatterns.behaviorals.State;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state.");
        //context.setState(this);
        context.setState(new StartState());
    }

    public String toString() {
        return "Start State";
    }
}
