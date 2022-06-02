package com.chrisweb.designpatterns.behaviorals.observer;

import java.util.ArrayList;

public class PostOffice implements Subject{

    private ArrayList<Mail> allMail;
    private ArrayList<Observer> observers;

    public PostOffice() {
        allMail = new ArrayList<Mail>();
        observers = new ArrayList<Observer>();
    }

    public void addMail(Mail mail) {
        allMail.add(mail);
        //Notify();
    }

    public ArrayList<Mail> getState() {
        return allMail;
    }


    @Override
    public void Attach(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void Detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void Notify() {
        for (int i =0; i < observers.size(); i++){
            observers.get(i).update(this);
        }
    }
}
