package org.xander.Strategy;

public class DuckSimulator {
    public static void main(String[] args) {
        System.out.println("I'm mallard duck");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("\nI'm model duck");
        Duck model = new ModelDuck();
        model.performFly();
        System.out.println("Installing rocket...");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
