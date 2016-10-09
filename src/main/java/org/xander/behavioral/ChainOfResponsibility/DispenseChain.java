package org.xander.behavioral.ChainOfResponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}