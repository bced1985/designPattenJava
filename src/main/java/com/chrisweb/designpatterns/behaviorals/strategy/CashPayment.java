package com.chrisweb.designpatterns.behaviorals.strategy;

public class CashPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Paiement Cash effectué avec succès !");
    }
}
