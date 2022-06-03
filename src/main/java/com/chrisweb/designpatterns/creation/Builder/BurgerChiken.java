package com.chrisweb.designpatterns.creation.Builder;

public class BurgerChiken extends Burger {
    @Override
    public String getName() {
        return "Burger Chiken";
    }

    @Override
    public float getPrice() {
        return 50.5f;
    }
}
