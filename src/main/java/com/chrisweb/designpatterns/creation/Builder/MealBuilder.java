package com.chrisweb.designpatterns.creation.Builder;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new BurgerVeg());
        meal.addItem(new ColdDrinkCoke());
        return meal;
    }

    public Meal prepareVegMealOther() {
        Meal meal = new Meal();
        meal.addItem(new BurgerVeg());
        meal.addItem(new ColdDrinkPepsi());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new BurgerChiken());
        meal.addItem(new ColdDrinkPepsi());
        return meal;
    }


}
