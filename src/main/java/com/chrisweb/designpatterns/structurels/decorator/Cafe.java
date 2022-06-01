package com.chrisweb.designpatterns.structurels.decorator;

public class Cafe extends Boisson{

    public Cafe() {
        description = "Cafe";
    }
    @Override
    public double getCout() {
        return 7.0;
    }
}
