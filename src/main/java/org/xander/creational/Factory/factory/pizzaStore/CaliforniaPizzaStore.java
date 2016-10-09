package org.xander.creational.Factory.factory.pizzaStore;

import org.xander.creational.Factory.factory.pizza.*;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza();
        } else return null;
    }
}