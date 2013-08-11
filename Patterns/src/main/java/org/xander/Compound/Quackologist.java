package org.xander.Compound;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck.toString() + " just quacked.");
    }
}
