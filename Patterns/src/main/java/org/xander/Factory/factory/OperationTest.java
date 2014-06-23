package org.xander.Factory.factory;

public class OperationTest {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        for (OperationWithConstantSpecific op : OperationWithConstantSpecific.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        System.out.println();
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }
}
