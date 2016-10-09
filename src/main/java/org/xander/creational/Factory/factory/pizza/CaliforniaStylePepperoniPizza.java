package org.xander.creational.Factory.factory.pizza;

public class CaliforniaStylePepperoniPizza extends Pizza {
    public CaliforniaStylePepperoniPizza() {
        name = "California Style Pepperoni Pizza";
        dough = "Middle Crust Dough";
        sauce = "Pepperoni Sauce";

        toppings.add("Smoked Salmon");
    }
}