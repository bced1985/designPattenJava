package com.chrisweb.designpatterns.structural.decorator;

public class Deca extends Boisson{

    public Deca() {
        description = "Deca";
    }

    @Override
    public double getCout() {
        return 5.2;
    }
}
