package com.chrisweb.designpatterns.behaviorals.CommandOther;

public class MainCommand {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyOrder buyOrder = new BuyOrder(stock);
        SellStock sellStock = new SellStock(stock);

        StockBroker stockBroker = new StockBroker();
        stockBroker.placeOrder(buyOrder);
        stockBroker.placeOrder(sellStock);

        stockBroker.executeOrder();
    }
}
