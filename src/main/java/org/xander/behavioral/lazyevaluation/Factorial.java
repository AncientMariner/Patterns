package org.xander.behavioral.lazyevaluation;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(20000));
    }

    public static int factorial(final int number) {
        return TailCalls.factorialTailRec(1, number).invoke();
    }
}
