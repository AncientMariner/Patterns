package org.xander.Compound;

import org.xander.Compound.Birds.Flock;
import org.xander.Compound.Birds.Quackable;
import org.xander.Compound.Decorator.QuackCounter;
import org.xander.Compound.Factory.AbstractDuckFactory;
import org.xander.Compound.Factory.CountingDuckFactory;
import org.xander.Compound.Factory.GeeseFactory;
import org.xander.Compound.Observer.Quackologist;

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

//        System.out.println("\nDuck simulator with Composite - Flocks");

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

        System.out.println("Duck simulator with Observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);


        System.out.println("\nThe ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
