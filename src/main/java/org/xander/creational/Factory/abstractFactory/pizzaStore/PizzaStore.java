package org.xander.creational.Factory.abstractFactory.pizzaStore;

import org.xander.creational.Factory.abstractFactory.pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
