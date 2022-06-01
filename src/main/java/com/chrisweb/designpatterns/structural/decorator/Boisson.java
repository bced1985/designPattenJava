package com.chrisweb.designpatterns.structural.decorator;

public abstract class Boisson {
    protected String description;

    public abstract double getCout();

    public String getDescription() {
        return this.description;
    }
}
