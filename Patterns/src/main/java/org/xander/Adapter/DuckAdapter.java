package org.xander.Adapter;

public class DuckAdapter implements Turkey {
    private static DuckAdapter duckAdapter;
    private Duck duck;

    private DuckAdapter() {
    }

    private static DuckAdapter getInstance() {
        if (duckAdapter == null) {
            duckAdapter = new DuckAdapter();
        }
        return duckAdapter;
    }

    public static DuckAdapter getInstanceWithDuck(Duck duck) {
        if(duck == null) {
            throw new IllegalStateException("object given to adapter is null");
        }
        duckAdapter = getInstance();
        duckAdapter.duck = duck;

        return duckAdapter;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
