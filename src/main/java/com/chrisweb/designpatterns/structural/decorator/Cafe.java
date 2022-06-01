package com.chrisweb.designpatterns.structural.decorator;

public class Cafe extends Boisson{

    public Cafe() {
        description = "Cafe";
    }
    @Override
    public double getCout() {
        return 7.0;
    }
}
