package com.chrisweb.designpatterns.behaviorals.observer;

public class MainObserver {
    public static void main(String[] args) {

        PostOffice postOffice = new PostOffice();
        Person chris = new Person("Chris");
        Person john = new Person("John");
        Mail m = new Mail("John", "Mbota", "Gloire à Dieu");
        Mail mm = new Mail("Chris", "Mbota", "Gloire à Dieu");

        postOffice.Attach(chris);
        postOffice.Attach(john);

        postOffice.addMail(m);
    }
}
