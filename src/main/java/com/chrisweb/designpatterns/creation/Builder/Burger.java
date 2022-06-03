package com.chrisweb.designpatterns.creation.Builder;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new PackingWrapper();
    }

    @Override
    public abstract float getPrice();
}
