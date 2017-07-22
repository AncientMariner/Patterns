package org.xander.creational.factory.abstractfactory.pizzastore;

import org.xander.creational.factory.abstractfactory.factories.ChicagoPizzaIngredientFactory;
import org.xander.creational.factory.abstractfactory.factories.PizzaIngredientFactory;
import org.xander.creational.factory.abstractfactory.pizza.*;

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
