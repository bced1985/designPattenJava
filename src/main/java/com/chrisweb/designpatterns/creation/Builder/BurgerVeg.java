package com.chrisweb.designpatterns.creation.Builder;

public class BurgerVeg extends Burger {
    @Override
    public String getName() {
        return "Veg Burger";
    }

    @Override
    public float getPrice() {
        return 25.0f;
    }
}
