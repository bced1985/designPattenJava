package com.chrisweb.designpatterns.structural.facade;

public class FacadeShapeMaker {
    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public FacadeShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCicle() {
        circle.draw();
    }
    public void drawRectangle() {
        rectangle.draw();
    }
    public void drawSquare() {
        square.draw();
    }
    // Ajout personnel
    public int surfaceOfRectange() {
        return rectangle.calculeSurface();
    }
}
