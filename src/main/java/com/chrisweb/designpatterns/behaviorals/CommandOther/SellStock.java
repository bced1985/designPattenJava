package com.chrisweb.designpatterns.behaviorals.CommandOther;

public class SellStock implements Order{
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sellStock();
    }
}
