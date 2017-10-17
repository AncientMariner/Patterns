package org.xander.behavioral.executearoundmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(new Random().nextInt(10000));
        }
        findMaxIterative(numbers);
        findMaxFunc(numbers);
        findMaxFuncParallel(numbers);
    }

    private static void findMaxFunc(List<Integer> numbers) {
        long start = System.currentTimeMillis();
        final int max = numbers.stream()
                               .reduce(0, Math::max);
        System.out.println("functional execution time " + (System.currentTimeMillis() - start));
        System.out.println(max);
    }

    private static void findMaxIterative(List<Integer> numbers) {
        long start = System.currentTimeMillis();

        int max = 0;
        for(int price : numbers) {
            if(max < price) max = price;
        }

        System.out.println("iterative execution time " + (System.currentTimeMillis() - start));
        System.out.println(max);
    }

    private static void findMaxFuncParallel(List<Integer> numbers) {
        long start = System.currentTimeMillis();

        final int max = numbers.parallelStream()
                               .reduce(0, Math::max);

        System.out.println("functional parallel execution time " + (System.currentTimeMillis() - start));
        System.out.println(max);
    }
}
