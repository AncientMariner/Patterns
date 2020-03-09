package org.xander.behavioral.strategy;

public class RubberDuck extends Duck{

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public static void main(String[] args) {
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        rubberDuckie.flyBehavior.fly();
        rubberDuckie.quackBehavior.quack();
        rubberDuckie.display();
    }

    @Override
    public void display() {
        System.out.println("I'm rubber duckie");
    }
}
