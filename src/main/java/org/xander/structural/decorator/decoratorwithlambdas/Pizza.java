package org.xander.structural.decorator.decoratorwithlambdas;

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

    static Pizza withSpecial(Pizza pizza, String topping) {
        return () -> pizza.bakePizza() + topping;
    }
}