package org.xander.creational.compound.birds;

import org.xander.creational.compound.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
