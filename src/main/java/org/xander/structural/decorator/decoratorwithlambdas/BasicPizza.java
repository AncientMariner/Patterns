package org.xander.structural.decorator.decoratorwithlambdas;

public class BasicPizza implements Pizza {
    @Override
    public String bakePizza() {
        return "Basic Pizza";
    }
}