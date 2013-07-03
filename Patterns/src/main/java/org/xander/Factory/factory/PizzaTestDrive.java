package org.xander.Factory.factory;

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
