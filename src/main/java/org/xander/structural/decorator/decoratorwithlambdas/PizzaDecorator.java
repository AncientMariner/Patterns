package org.xander.structural.decorator.decoratorwithlambdas;


import java.util.function.Function;
import java.util.stream.Stream;

public class PizzaDecorator {
    private final Function<Pizza, Pizza> toppings;

    @SafeVarargs
    private PizzaDecorator(Function<Pizza, Pizza>... desiredToppings) {
//        this.toppings = Stream.of(desiredToppings).reduce(Function.identity(), Function::andThen);
//        this.toppings = Stream.of(desiredToppings).reduce((cur, next) -> cur.compose(next)).orElseGet(Function::identity);
//        this.toppings = Stream.of(desiredToppings).reduce((cur, next) -> cur.andThen(next)).orElse(Function.identity());
        this.toppings = Stream.of(desiredToppings).reduce((cur) -> cur, (cur, next) -> cur.andThen(next));
    }

    @SafeVarargs
    public static String bakePizza(Pizza pizza, Function<Pizza, Pizza>... desiredToppings) {
        return new PizzaDecorator(desiredToppings).bakePizza(pizza);
    }

    private String bakePizza(Pizza pizza) {
        return this.toppings.apply(pizza).bakePizza();
    }
}