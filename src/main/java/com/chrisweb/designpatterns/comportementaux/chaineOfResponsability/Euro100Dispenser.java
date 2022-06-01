package com.chrisweb.designpatterns.comportementaux.chaineOfResponsability;

public class Euro100Dispenser implements DispenseChain{

    private DispenseChain chain;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if(currency.getAmount() >= 100) {
            int number = currency.getAmount() / 100;
            int remain = currency.getAmount() % 100;
            System.out.println("Dispensing " + number + " billet(s) de 100 euros ");
            if(remain != 0) chain.dispense(new Currency(remain));

        } else {
            chain.dispense(currency);
        }
    }
}
