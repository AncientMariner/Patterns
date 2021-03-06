package org.xander.behavioral.monad;

import java.util.function.Function;

public class Success<A> implements Try<A> {
    private final A value;

    public Success(A value) {
        this.value = value;
    }

    public boolean isFailure() {
        return false;
    }

    @Override
    public <B> Try<B> map(Function<A, B> function) {
        return new Success<>(function.apply(value));
    }

    @Override
    public <B> Try<B> flatMap(Function<A, Try<B>> function) {
        return function.apply(value);
    }
}
