package org.xander.creational.compound.factory;

import org.xander.creational.compound.birds.Goose;
import org.xander.creational.compound.birds.GooseAdapter;
import org.xander.creational.compound.birds.Quackable;

public class GeeseFactory extends AbstractDuckFactory {

    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }

    @Override
    public Quackable createMallardDuck() {
        return createGoose();
    }

    @Override
    public Quackable createRedheadDuck() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Quackable createDuckCall() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Quackable createRubberDuck() {
        throw new UnsupportedOperationException();
    }
}
