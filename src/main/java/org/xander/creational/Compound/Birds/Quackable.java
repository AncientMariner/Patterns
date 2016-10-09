package org.xander.creational.Compound.Birds;

import org.xander.creational.Compound.Observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
