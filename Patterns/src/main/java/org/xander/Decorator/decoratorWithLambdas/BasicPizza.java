package org.xander.Decorator.decoratorWithLambdas;

public class BasicPizza implements Pizza {
    @Override
    public String bakePizza() {
        return "Basic Pizza";
    }
}