package org.xander.structural.adapter;

import static org.xander.structural.adapter.TurkeyAdapter.TURKEY_ADAPTER;

public class DuckAndTurkeyTestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = TURKEY_ADAPTER.getInstanceWithTurkey(wildTurkey);
        Turkey duckAdapter = DuckAdapter.getInstanceWithDuck(mallardDuck);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\n####adapter####");
        System.out.println("The duck says...");
        testDuck(mallardDuck);

        System.out.println("The turkey adapter says...");
        testDuck(turkeyAdapter);


        System.out.println("\n\n\n");
        System.out.println("The Turkey says...");
        testTurkey(wildTurkey);


        System.out.println("The duck adapter says...");
        testTurkey(duckAdapter);
    }

    private static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
