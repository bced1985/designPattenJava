package com.chrisweb.designpatterns.structural.decorator;

public class Espresso extends Boisson{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double getCout() {
        return 6.5;
    }
}
