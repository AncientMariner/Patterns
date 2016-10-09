package org.xander.creational.Factory.abstractFactory.pizzaStore;

import org.xander.creational.Factory.abstractFactory.factories.ChicagoPizzaIngredientFactory;
import org.xander.creational.Factory.abstractFactory.factories.PizzaIngredientFactory;
import org.xander.creational.Factory.abstractFactory.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    public static final String CHICAGO_STYLE = "Chicago Style";

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName(CHICAGO_STYLE + " " + pizza.toString());
        } else if (type.equals("veggies")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName(CHICAGO_STYLE + " " + pizza.toString());
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName(CHICAGO_STYLE + " " + pizza.toString());
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName(CHICAGO_STYLE + " " + pizza.toString());
        }
        return pizza;
    }
}