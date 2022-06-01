package com.chrisweb.designpatterns.structural.decorator;

public class MainDecorator {

    public static void main(String[] args) {
        Boisson espresso = new Espresso();
        System.out.println("Description : " + espresso.getDescription() + " | Prix : " + espresso.getCout());

        espresso = new LaitDecoration(espresso);
        System.out.println("Description : " + espresso.getDescription() + " | Prix : " + espresso.getCout());

        espresso = new ChocolatDecoration(espresso);
        System.out.println("Description : " + espresso.getDescription() + " | Prix : " + espresso.getCout());

        espresso = new CaramelDecoration(espresso);
        System.out.println("Description : " + espresso.getDescription() + " | Prix : " + espresso.getCout());

    }
}
