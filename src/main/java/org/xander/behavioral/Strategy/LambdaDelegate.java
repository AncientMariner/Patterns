package org.xander.behavioral.Strategy;

import java.math.BigDecimal;
import java.util.function.Function;

public class LambdaDelegate {
    private Function<String, BigDecimal> priceFinder;

    public LambdaDelegate(Function<String, BigDecimal> priceFinder) {
        this.priceFinder = priceFinder;
    }

    public BigDecimal computePrice(final String ticker, final int shares) {
        //value could be taken from 3rd party source such as web service
        return priceFinder.apply(ticker).multiply(BigDecimal.valueOf(shares));
    }

    public static void main(String[] args) {
        LambdaDelegate lambdaDelegate = new LambdaDelegate(ticker -> new BigDecimal("6.01"));
        BigDecimal abc = lambdaDelegate.computePrice("abc", 1000);
        System.out.println(abc);
    }
}
