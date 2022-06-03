package com.chrisweb.designpatterns.creation.Builder;

public class ColdDrinkPepsi extends ColdDrink {
    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public float getPrice() {
        return 35.0f;
    }
}
