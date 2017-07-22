package org.xander.creational.compound.observer;

public interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
