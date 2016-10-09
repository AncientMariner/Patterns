package org.xander.creational.Factory.factory.pizza;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough with raw powder";
        sauce = "Chili Sauce";

        toppings.add("Chili pepper");
    }
}