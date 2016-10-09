package org.xander.Compound.Birds;

import org.xander.Compound.Observer.Observable;
import org.xander.Compound.Observer.Observer;

public class RedheadDuck implements Quackable {
    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
