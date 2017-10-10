package org.xander.behavioral.lazyevaluation;

public class TailCalls {
    public static <T> TailCall<T> call(final TailCall<T> nextCall) { return nextCall; }
    public static <T> TailCall<T> done(final T value) { 
        return new TailCall<T>() {
            @Override public boolean isComplete() { return true; }
            @Override public T result() { return value; } 
            @Override public TailCall<T> apply() { throw new Error("not implemented"); }
        };
    }
    
    public static TailCall<Integer> factorialTailRec( final int factorial, final int number) {
        if (number == 1) {
            return done(factorial);
        } else {
            return call(() -> factorialTailRec(factorial * number, number - 1));
        }
    }
}
