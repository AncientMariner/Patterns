package org.xander.behavioral.lazyevaluation;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import static org.xander.behavioral.lazyevaluation.Memoizer.callMemoized;

public class RodCutterBasic {

    public RodCutterBasic(final List<Integer> pricesForLength) {
        prices = pricesForLength;
    }

    final List<Integer> prices;

    public int maxProfit(final int length) {
        int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
        for (int i = 1; i < length; i++) {
            int priceWhenCut = maxProfit(i) + maxProfit(length - i);
            if (profit < priceWhenCut) profit = priceWhenCut;
        }
        return profit;
    }

    public int maxProfitMemoized(final int rodLength) {
        BiFunction<Function<Integer, Integer>, Integer, Integer> compute =
                (func, length) -> {
                    int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
                    for (int i = 1; i < length; i++) {
                        int priceWhenCut = func.apply(i) + func.apply(length - i);
                        if (profit < priceWhenCut) profit = priceWhenCut;
                    }
                    return profit;
                };
        return callMemoized(compute, rodLength);
    }

    public static void main(String[] args) {
        final List<Integer> priceValues = Arrays.asList(2, 1, 1, 2, 2, 2, 1, 8, 9, 15);
        RodCutterBasic rodCutterBasic = new RodCutterBasic(priceValues);

//        System.out.println(rodCutterBasic.maxProfit(5));
//        System.out.println(rodCutterBasic.maxProfit(22));
        System.out.println(rodCutterBasic.maxProfitMemoized(5));
        System.out.println(rodCutterBasic.maxProfitMemoized(22));
    }
}
