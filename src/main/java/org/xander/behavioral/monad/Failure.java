package org.xander.behavioral.monad;

import java.util.function.Function;

public class Failure<A> implements Try<A> {
    private final Object error;

    public Failure(Object error) {
        this.error = error;
    }

    public boolean isFailure() {
        return true;
    }

    @Override
    public <B> Try<B> map(Function<A, B> function) {
        return (Failure<B>)this;
    }

    @Override
    public <B> Try<B> flatMap(Function<A, Try<B>> function) {
        return (Failure<B>)this;
    }
}
