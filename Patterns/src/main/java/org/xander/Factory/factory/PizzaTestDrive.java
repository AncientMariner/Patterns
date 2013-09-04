package org.xander.Factory.factory;

import org.xander.Factory.factory.pizza.ChicagoPizzaStore;
import org.xander.Factory.factory.pizza.Pizza;
import org.xander.Factory.factory.pizzaStore.CaliforniaPizzaStore;
import org.xander.Factory.factory.pizzaStore.NYPizzaStore;
import org.xander.Factory.factory.pizzaStore.PizzaStore;

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
