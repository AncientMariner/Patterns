package org.xander.Factory.factory;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    void bake() {
        System.out.println("Bake for 30 minutes at 300");
    }
}
