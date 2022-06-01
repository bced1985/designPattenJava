package com.chrisweb.designpatterns.structurels.decorator;

public class ChocolatDecoration extends BoissonDecorator{
    public ChocolatDecoration(Boisson boisson) {
        super(boisson);
     }

    @Override
    public double getCout() {
        return 3.3 + boisson.getCout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au chocolat";
    }
}
