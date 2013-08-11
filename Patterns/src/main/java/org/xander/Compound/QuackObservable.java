package org.xander.Compound;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
