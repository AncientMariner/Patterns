package org.xander.behavioral.LazyEvaluation;

import java.util.function.Supplier;

public class LazyEvaluator {

    public static boolean evaluate(final int value) {
        System.out.println("evaluating..." + value);
        return value > 100;
    }

    public static void eagerEvaluator(final boolean input1, final boolean input2) {
        System.out.println("eager call");
        System.out.println("accept?: " + (input1 && input2));
    }

    public static void lazyEvaluator(final Supplier<Boolean> input1, final Supplier<Boolean> input2) {
        System.out.println("lazy call");
        System.out.println("accept?: " + (input1.get() && input2.get()));
    }

    public static void main(String[] args) {
        /*
        evaluating...101
        evaluating...100
        eager call
        accept?: false
        */
        eagerEvaluator(evaluate(101), evaluate(100));

        /*
        lazy call
        evaluating...101
        evaluating...100
        accept?: false
        */
        lazyEvaluator(() -> evaluate(101), () -> evaluate(100));
    }
}
