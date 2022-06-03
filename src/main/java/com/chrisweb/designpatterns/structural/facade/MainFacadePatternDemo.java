package com.chrisweb.designpatterns.structural.facade;

public class MainFacadePatternDemo {
    public static void main(String[] args) {
        FacadeShapeMaker shapeMaker = new FacadeShapeMaker();

        shapeMaker.drawCicle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
        System.out.println("La surface du rectangle est : " + shapeMaker.surfaceOfRectange() + " m².");
    }
}
