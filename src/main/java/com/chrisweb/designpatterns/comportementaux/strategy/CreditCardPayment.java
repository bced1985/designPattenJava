package com.chrisweb.designpatterns.comportementaux.strategy;

public class CreditCardPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Paiement Credit-Card effectué avec succès !");
    }
}
