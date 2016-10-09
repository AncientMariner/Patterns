package org.xander.creational.Compound.Factory;

import org.xander.creational.Compound.Birds.Goose;
import org.xander.creational.Compound.Birds.GooseAdapter;
import org.xander.creational.Compound.Birds.Quackable;

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
