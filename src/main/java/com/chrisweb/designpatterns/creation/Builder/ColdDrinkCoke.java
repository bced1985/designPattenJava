package com.chrisweb.designpatterns.creation.Builder;

public class ColdDrinkCoke extends ColdDrink {
    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public float getPrice() {
        return 30.0f;
    }
}
