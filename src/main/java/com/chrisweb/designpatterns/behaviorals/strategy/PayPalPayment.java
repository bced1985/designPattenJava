package com.chrisweb.designpatterns.behaviorals.strategy;

public class PayPalPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Paiement Paypal effectué avec succès !");
    }
}
