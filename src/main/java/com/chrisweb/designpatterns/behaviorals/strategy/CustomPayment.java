package com.chrisweb.designpatterns.behaviorals.strategy;

public class CustomPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Paiement personnalisé a été effectué avec succès !");
    }
}
