package org.xander.Compound.Observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
