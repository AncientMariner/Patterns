package org.xander.Factory.abstractFactory.pizza;

import org.xander.Factory.abstractFactory.factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza into triangle pieces");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 33 minutes at 250");
    }

    @Override
    public String toString() {
        return "Cheese Pizza";
    }
}
