package org.xander.creational.Factory.factory;

// Enum type with constant-specific
public enum Operation {
    PLUS {
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        double apply(double x, double y) {
            return x / y;
        }
    };

    abstract double apply(double x, double y);

    public static Operation inverse(Operation op) {
        switch (op) {
            case PLUS:
                return Operation.MINUS;
            case MINUS:
                return Operation.PLUS;
            case TIMES:
                return Operation.DIVIDE;
            case DIVIDE:
                return Operation.TIMES;
            default:
                throw new AssertionError("Unknown op: " + op);
        }
    }
}