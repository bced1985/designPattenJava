package com.chrisweb.designpatterns.decorator;

public abstract class Boisson {
    protected String description;

    public abstract double getCout();

    public String getDescription() {
        return this.description;
    }
}
