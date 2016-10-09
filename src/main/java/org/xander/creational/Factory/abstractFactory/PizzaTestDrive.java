package org.xander.creational.Factory.abstractFactory;

import org.xander.creational.Factory.abstractFactory.pizza.Pizza;
import org.xander.creational.Factory.abstractFactory.pizzaStore.ChicagoPizzaStore;
import org.xander.creational.Factory.abstractFactory.pizzaStore.NYPizzaStore;
import org.xander.creational.Factory.abstractFactory.pizzaStore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName() + " was ordered\n");

        pizza = chicagoPizzaStore.orderPizza("pepperoni");
        System.out.println(pizza.getName() + " was ordered\n");

        pizza = nyPizzaStore.orderPizza("veggies");
        System.out.println(pizza.getName() + " was ordered\n");

        pizza = chicagoPizzaStore.orderPizza("clam");
        System.out.println(pizza.getName() + " was ordered\n");
    }
}