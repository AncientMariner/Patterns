package org.xander.creational.Factory.abstractFactory.pizza;

import org.xander.creational.Factory.abstractFactory.factories.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza into thin triangle slices");
    }

    @Override
    public String toString() {
        return "Pepperoni Pizza";
    }
}
