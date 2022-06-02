package com.chrisweb.designpatterns.behaviorals.observer;

import java.util.ArrayList;

public class Person implements Observer {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(Object o) {
        if (o instanceof PostOffice) {
            PostOffice po = (PostOffice) o;
            checkMail(po.getState());
         }
    }

    private void checkMail(ArrayList<Mail> m) {
        /*for (int i = 0; i < m.size(); i++) {
            if (name.compareTo(m.get(i).receiverName) == 0) {
                System.out.println(name + ": " + m.get(i).content);
            }
        }*/
        for (Mail mail : m) {
            if (name.compareTo(mail.getReceiverName()) == 0) {
                System.out.println(name + ": " + mail.getContent());
            }
        }
    }
}
