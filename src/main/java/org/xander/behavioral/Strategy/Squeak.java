package org.xander.behavioral.Strategy;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
