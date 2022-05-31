package com.chrisweb.designpatterns.decorator;

public class LaitDecoration extends BoissonDecorator{

    public LaitDecoration(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double getCout() {
        return 1.5 + boisson.getCout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au lait";
    }
}
