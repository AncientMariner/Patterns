package org.xander.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class GenericBuilder<T> {
    private final Supplier<T> instantiator;
    private List<Consumer<T>> instanceModifiers = new ArrayList<>();
    private List<Predicate<T>> predicates = new ArrayList<>();

    public GenericBuilder(Supplier<T> instantiator) {
        this.instantiator = instantiator;
//        predicate for the Person class
//        predicates.add(t -> ((Person) t).isFemale());
    }

    public static <T> GenericBuilder<T> of(Supplier<T> instantiator) {
        return new GenericBuilder<T>(instantiator);
    }

    public <U> GenericBuilder<T> with(BiConsumer<T, U> consumer, U value) {
        Consumer<T> c = instance -> consumer.accept(instance, value);
        instanceModifiers.add(c);
        return this;
    }

    public T build() {
        T value = instantiator.get();
        instanceModifiers.forEach(modifier -> modifier.accept(value));
        verifyPredicates(value);
        instanceModifiers.clear();
        return value;
    }

    private void verifyPredicates(T value) {
        List<Predicate<T>> violated = predicates.stream()
                .filter(e -> !e.test(value)).collect(Collectors.toList());
        if (!violated.isEmpty()) {
            throw new IllegalStateException(value.toString()
                    + " violates predicates " + violated);
        }
    }
}