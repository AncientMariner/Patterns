package org.xander.Factory.abstractFactory;

import org.xander.Factory.abstractFactory.factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }

    @Override
    void cut() {
        System.out.println("Cutting pizza into triangle pieces");
    }

    @Override
    void bake() {
        System.out.println("Bake for 33 minutes at 250");
    }

    @Override
    public String toString() {
        return "Cheese Pizza";
    }
}
