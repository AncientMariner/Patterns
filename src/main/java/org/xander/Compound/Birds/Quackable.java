package org.xander.Compound.Birds;

import org.xander.Compound.Observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
