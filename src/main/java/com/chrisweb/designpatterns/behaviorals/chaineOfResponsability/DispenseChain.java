package com.chrisweb.designpatterns.behaviorals.chaineOfResponsability;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}
