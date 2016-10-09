package org.xander.creational.Factory.abstractFactory.pizza;

import org.xander.creational.Factory.abstractFactory.factories.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza into rectangular pieces");
    }

    @Override
    public String toString() {
        return "Clam Pizza";
    }
}
