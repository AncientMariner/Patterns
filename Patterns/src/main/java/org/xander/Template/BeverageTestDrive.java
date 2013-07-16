package org.xander.Template;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        System.out.println("\nMaking tea...");
        tea.prepare();

        Coffee coffee = new Coffee();
        System.out.println("\nMaking coffee...");
        coffee.prepare();

        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("\nMaking coffee with hook...");
        coffeeWithHook.prepare();
    }
}