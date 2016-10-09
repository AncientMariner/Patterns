package org.xander.behavioral.ChainOfResponsibility;

public class Currency {
    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}