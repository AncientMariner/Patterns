package org.xander.Decorator.decoratorWithLambdas;

public interface Pizza {
    String bakePizza();

    static Pizza withChickenTikka(Pizza pizza) {
        return () -> pizza.bakePizza() + " with chicken";
    }

    static Pizza withProsciutto(Pizza pizza) {
        return new Pizza() {
            @Override
            public String bakePizza() {
                return pizza.bakePizza() + " with prosciutto";
            }
        };
    }
}