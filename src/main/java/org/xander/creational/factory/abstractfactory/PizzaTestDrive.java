package org.xander.creational.factory.abstractfactory;

import org.xander.creational.factory.abstractfactory.pizza.Pizza;
import org.xander.creational.factory.abstractfactory.pizzastore.ChicagoPizzaStore;
import org.xander.creational.factory.abstractfactory.pizzastore.NYPizzaStore;
import org.xander.creational.factory.abstractfactory.pizzastore.PizzaStore;

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
