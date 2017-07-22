package org.xander.creational.factory.factory;

import org.xander.creational.factory.factory.pizza.ChicagoPizzaStore;
import org.xander.creational.factory.factory.pizza.Pizza;
import org.xander.creational.factory.factory.pizzastore.CaliforniaPizzaStore;
import org.xander.creational.factory.factory.pizzastore.NYPizzaStore;
import org.xander.creational.factory.factory.pizzastore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore californiaStore = new CaliforniaPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName() + " was ordered\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println(pizza.getName() + " was ordered\n");

        pizza = californiaStore.orderPizza("clam");
        System.out.println(pizza.getName() + " was ordered\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println(pizza.getName() + " was ordered\n");

    }
}
