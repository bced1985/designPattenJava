package com.chrisweb.designpatterns.structurels.decorator;

public class CaramelDecoration extends BoissonDecorator{

    public CaramelDecoration(Boisson boisson) {
        super(boisson);
    }


    @Override
    public double getCout() {
        return 2.0 + boisson.getCout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au caramel";
    }
}
