package com.chrisweb.designpatterns.behaviorals.CommandOther;

public class Stock {

    private String stockName = "Google Share";
    private int stockQuantity = 20;

    public void buyStock() {
        System.out.println("Buying of stock : " + this.stockName);
    }


    public void sellStock() {
        System.out.println("Selling of stock : " + this.stockName);
    }
}
