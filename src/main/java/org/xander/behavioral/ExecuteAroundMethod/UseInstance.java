package org.xander.behavioral.ExecuteAroundMethod;

@FunctionalInterface
public interface UseInstance<T, X extends Throwable> {
    void accept(T instance) throws X;
}
