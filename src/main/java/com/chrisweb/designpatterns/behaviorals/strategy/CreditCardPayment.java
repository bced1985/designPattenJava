package com.chrisweb.designpatterns.behaviorals.strategy;

public class CreditCardPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Paiement Credit-Card effectué avec succès !");
    }
}
