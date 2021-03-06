package org.xander.creational.factory.abstractfactory.pizzastore;

import org.xander.creational.factory.abstractfactory.factories.NYPizzaIngredientFactory;
import org.xander.creational.factory.abstractfactory.factories.PizzaIngredientFactory;
import org.xander.creational.factory.abstractfactory.pizza.*;

public class NYPizzaStore extends PizzaStore {

    public static final String NEW_YORK_STYLE = "New York Style";

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName(NEW_YORK_STYLE + " " + pizza.toString());
        } else if (type.equals("veggies")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName(NEW_YORK_STYLE + " " + pizza.toString());
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName(NEW_YORK_STYLE + " " + pizza.toString());
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName(NEW_YORK_STYLE + " " + pizza.toString());
        }
        return pizza;
    }
}
