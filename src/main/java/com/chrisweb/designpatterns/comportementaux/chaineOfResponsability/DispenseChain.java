package com.chrisweb.designpatterns.comportementaux.chaineOfResponsability;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}
