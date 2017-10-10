package org.xander.behavioral.lazyevaluation;

import java.math.BigInteger;

import static org.xander.behavioral.lazyevaluation.TailCalls.call;
import static org.xander.behavioral.lazyevaluation.TailCalls.done;

public class BigFactorial {
    public static BigInteger decrement(final BigInteger number) {
        return number.subtract(BigInteger.ONE);
    }

    public static BigInteger multiply(final BigInteger first, final BigInteger second) {
        return first.multiply(second);
    }

    final static BigInteger ONE = BigInteger.ONE;
    final static BigInteger FIVE = new BigInteger("5");
    final static BigInteger TWENTYK = new BigInteger("20000");

    private static TailCall<BigInteger> factorialTailRec(final BigInteger factorial, final BigInteger number) {
        if (number.equals(BigInteger.ONE)) {
            return done(factorial);
        } else {
            return call(() -> factorialTailRec(multiply(factorial, number), decrement(number)));
        }
    }

    public static BigInteger factorial(final BigInteger number) {
        return factorialTailRec(BigInteger.ONE, number).invoke();
    }

    public static void main(final String[] args) {
        System.out.println(factorial(FIVE));
        System.out.println(String.format("%.10s...", factorial(TWENTYK)));
    }
}
