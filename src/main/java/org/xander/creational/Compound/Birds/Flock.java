package org.xander.creational.Compound.Birds;

import org.xander.creational.Compound.Observer.Observable;
import org.xander.creational.Compound.Observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();
    Observable observable;

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.registerObserver(observer);
        }

        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
    }
}
