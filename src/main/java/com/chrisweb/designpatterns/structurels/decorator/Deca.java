package com.chrisweb.designpatterns.structurels.decorator;

public class Deca extends Boisson{

    public Deca() {
        description = "Deca";
    }

    @Override
    public double getCout() {
        return 5.2;
    }
}
