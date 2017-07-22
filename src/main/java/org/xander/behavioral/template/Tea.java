package org.xander.behavioral.template;

public class Tea extends CaffeineBeverage {
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    protected void brew() {
        System.out.println("Steeping the tea");
    }
}