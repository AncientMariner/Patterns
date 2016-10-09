package org.xander.creational.Factory.factory.pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Very Thick Dough";
        sauce = "Pepperoni Sauce";

        toppings.add("Smoked Meat");
    }

    @Override
    public void box() {
        System.out.println("Place pizza in official Chicago PizzaStore box");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza into 4 pieces");
    }
}
