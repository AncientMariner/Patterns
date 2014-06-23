package org.xander.Factory.factory;

public enum OperationWithConstantSpecific {
    PLUS("+") { double apply(double x, double y) {return  x + y;}},
    MINUS("-") { double apply(double x, double y) {return  x - y;}},
    TIMES("*") { double apply(double x, double y) {return  x * y;}},
    DIVIDE("/") { double apply(double x, double y) {return  x / y;}};

    private final String symbol;
    OperationWithConstantSpecific(String symbol) { this.symbol = symbol; }
    @Override public String toString() {return symbol;}

    abstract double apply(double x, double y);
}
