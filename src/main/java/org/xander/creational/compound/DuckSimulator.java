package org.xander.creational.compound;

import org.xander.creational.compound.birds.Flock;
import org.xander.creational.compound.birds.Quackable;
import org.xander.creational.compound.decorator.QuackCounter;
import org.xander.creational.compound.factory.AbstractDuckFactory;
import org.xander.creational.compound.factory.CountingDuckFactory;
import org.xander.creational.compound.factory.GeeseFactory;
import org.xander.creational.compound.observer.Quackologist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractDuckFactory geeseFactory = new GeeseFactory();

        duckSimulator.simulate(duckFactory, geeseFactory);
    }

    void simulate(AbstractDuckFactory duckFactory, AbstractDuckFactory geeseFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = geeseFactory.createMallardDuck();  // pretend this is a goose

//        System.out.println("\nDuck simulator with composite - Flocks");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

//        System.out.println("\nDuck Simulator: whole Flock simulator\n");
//        simulate(flockOfDucks);
//
//
//        System.out.println("\nDuck Simulator: Mallard Duck simulator\n");
//        simulate(flockOfMallards);

        System.out.println("Duck simulator with observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);


        System.out.println("\nThe ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
