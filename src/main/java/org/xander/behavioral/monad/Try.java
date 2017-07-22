package org.xander.behavioral.monad;

import java.util.function.Function;

public interface Try<A> {
    <B> Try<B> map(Function<A, B> function);
    <B> Try<B> flatMap(Function<A, Try<B>> function);
    boolean isFailure();
}
