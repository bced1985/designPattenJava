package com.chrisweb.designpatterns.behaviorals.CommandOther;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {
    private List<Order> orderList = new ArrayList<Order>();

    public void placeOrder(Order order) {
        this.orderList.add(order);
    }

    public void executeOrder(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
