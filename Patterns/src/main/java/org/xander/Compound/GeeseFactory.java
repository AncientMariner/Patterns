package org.xander.Compound;

public class GeeseFactory extends AbstractDuckFactory {

    Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }

    @Override
    Quackable createMallardDuck() {
        return createGoose();
    }

    @Override
    Quackable createRedheadDuck() {
        throw new UnsupportedOperationException();
    }

    @Override
    Quackable createDuckCall() {
        throw new UnsupportedOperationException();
    }

    @Override
    Quackable createRubberDuck() {
        throw new UnsupportedOperationException();
    }
}
