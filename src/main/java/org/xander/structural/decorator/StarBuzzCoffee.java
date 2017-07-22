package org.xander.structural.decorator;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage espressoBeverage = new Espresso();
        System.out.println(espressoBeverage.getDescription() + " $" + espressoBeverage.cost());

        Beverage houseBlendBeverage = new HouseBlend();
        houseBlendBeverage = new Mocha(houseBlendBeverage);
        System.out.println(houseBlendBeverage.getDescription() + " $" + houseBlendBeverage.cost());

        Beverage darkRoastBeverage = new DarkRoast();
        darkRoastBeverage = new SteamedMilk(darkRoastBeverage);
        darkRoastBeverage = new Caramel(darkRoastBeverage);
        System.out.println(darkRoastBeverage.getDescription() + " $" + darkRoastBeverage.cost());

        Beverage espressoDoubleSteamedMilk = new Espresso();
        espressoDoubleSteamedMilk = new SteamedMilk(espressoDoubleSteamedMilk);
        espressoDoubleSteamedMilk = new SteamedMilk(espressoDoubleSteamedMilk);
        System.out.println(espressoDoubleSteamedMilk.getDescription() + " $" + espressoDoubleSteamedMilk.cost());

    }
}