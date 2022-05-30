package com.chrisweb.designpatterns.strategy;

public class CashPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("Paiement Cash effectué avec succès !");
    }
}
