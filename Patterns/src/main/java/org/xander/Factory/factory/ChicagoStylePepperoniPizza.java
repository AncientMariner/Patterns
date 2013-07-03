package org.xander.Factory.factory;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Very Thick Dough";
        sauce = "Pepperoni Sauce";

        toppings.add("Smoked Meat");
    }

    @Override
    void box() {
        System.out.println("Place pizza in official Chicago PizzaStore box");
    }

    @Override
    void cut() {
        System.out.println("Cutting pizza into 4 pieces");
    }
}
