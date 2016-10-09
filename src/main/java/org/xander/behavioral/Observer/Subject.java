package org.xander.behavioral.Observer;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
