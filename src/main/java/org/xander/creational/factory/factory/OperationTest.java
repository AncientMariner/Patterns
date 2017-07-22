package org.xander.creational.factory.factory;

import java.util.Arrays;
import java.util.Collection;

public class OperationTest {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        for (OperationWithConstantSpecific op : OperationWithConstantSpecific.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        System.out.println();
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));

        testBoundedTypeToken(ExtendedOperation.class, x, y);
        testBoundedWildCardType(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    private static void testBoundedWildCardType(Collection<? extends OperationBase> opSet, double x, double y) {
        for (OperationBase op : opSet)
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }

    private static <T extends Enum<T> & OperationBase> void testBoundedTypeToken(
            Class<T> opSet, double x, double y) {
        for (OperationBase op : opSet.getEnumConstants())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }
}
