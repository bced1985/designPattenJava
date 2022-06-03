package com.chrisweb.designpatterns.structural.facade;

public class Rectangle implements Shape {

    private int longueur = 50;
    private int largeur = 10;

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }

    public int calculeSurface() {
        return this.longueur * this.largeur;
    }
}
