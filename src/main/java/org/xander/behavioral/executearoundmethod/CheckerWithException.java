package org.xander.behavioral.executearoundmethod;

public class CheckerWithException {
    public int checkValue(final int amount) {
        if (amount == 0) {
            throw new IllegalArgumentException("value is 0");
        }
        return 0;
    }
}
