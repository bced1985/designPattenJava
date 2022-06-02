package com.chrisweb.designpatterns.behaviorals.CommandOther;

public class BuyOrder implements Order{

    private Stock stock;

    public BuyOrder(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buyStock();
    }
}
