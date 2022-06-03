package com.chrisweb.designpatterns.creation.Builder;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new PackingBottle();
    }

    @Override
    public abstract float getPrice();
}
