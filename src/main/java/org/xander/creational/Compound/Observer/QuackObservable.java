package org.xander.creational.Compound.Observer;

public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
