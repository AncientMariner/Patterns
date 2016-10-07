package org.xander.Decorator.decoratorWithLambdas;


import java.util.function.Function;
import java.util.stream.Stream;

public class PizzaDecorator {
    private final Function<Pizza, Pizza> toppings;

    private PizzaDecorator(Function<Pizza, Pizza>... desiredToppings) {
        this.toppings = Stream.of(desiredToppings).reduce(Function.identity(), Function::andThen);
    }


    public static String bakePizza(Pizza pizza, Function<Pizza, Pizza>... desiredToppings) {
        return new PizzaDecorator(desiredToppings).bakePizza(pizza);
    }

    private String bakePizza(Pizza pizza) {
        return this.toppings.apply(pizza).bakePizza();
    }
}