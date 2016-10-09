package org.xander.structural.Adapter;

public enum TurkeyAdapter implements Duck {
    TURKEY_ADAPTER;
    private Turkey turkey;

    public TurkeyAdapter getInstanceWithTurkey(Turkey turkey) {
        if (turkey == null) {
            throw new IllegalStateException("object given to adapter is null");
        }
        TURKEY_ADAPTER.turkey = turkey;

        return TURKEY_ADAPTER;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++)
            turkey.fly();
    }
}
