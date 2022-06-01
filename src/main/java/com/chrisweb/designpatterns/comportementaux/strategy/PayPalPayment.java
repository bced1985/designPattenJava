package com.chrisweb.designpatterns.comportementaux.strategy;

public class PayPalPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Paiement Paypal effectué avec succès !");
    }
}
