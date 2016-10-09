package org.xander.creational.Compound.Factory;

import org.xander.creational.Compound.Birds.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
