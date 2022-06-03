package com.chrisweb.designpatterns.creation.Builder;

public class MainBuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost : " + vegMeal.getCost());

        Meal vegMealOther = mealBuilder.prepareVegMealOther();
        System.out.println("\n\nVeg Meal Other");
        vegMealOther.showItems();
        System.out.println("Total cost : " + vegMealOther.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost : " + nonVegMeal.getCost());
    }
}
