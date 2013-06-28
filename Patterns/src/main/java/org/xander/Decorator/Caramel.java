package org.xander.Decorator;

public class Caramel extends CondimentDecorator {
    Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .91 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }
}