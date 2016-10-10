package org.xander.creational.Builder.burger;

import static org.xander.creational.Builder.burger.Bacon.bacon;
import static org.xander.creational.Builder.burger.BeefPatty.beef;
import static org.xander.creational.Builder.burger.Cheese.cheese;
import static org.xander.creational.Builder.burger.Mushroom.mushroom;
import static org.xander.creational.Builder.burger.Tomato.tomato;

class Burger {
    private final Patty patty;
    private final Topping topping;

    private Burger(Patty patty, Topping topping) {
        this.patty = patty;
        this.topping = topping;
    }

    public static BurgerBuilder burger() {
        return patty -> topping -> new Burger(patty, topping);
    }

    interface BurgerBuilder {
        ToppingBuilder with(Patty patty);

        default VegetarianBuilder vegetarian() {
            return patty -> topping -> new Burger(patty, topping);
        }
    }

    @FunctionalInterface
    interface VegetarianBuilder {
        VegetarianToppingBuilder with(VegetarianPatty main);
    }

    @FunctionalInterface
    interface VegetarianToppingBuilder {
        Burger and(VegetarianTopping topping);
    }

    interface ToppingBuilder {
        Burger and(Topping topping);

        default FreeToppingBuilder andFree() {
            return topping -> and(topping);
        }
    }

    @FunctionalInterface
    interface FreeToppingBuilder {
        Burger topping(FreeTopping topping);
    }


    public static void main(String[] args) {
        Burger lunch = burger().with(beef()).andFree().topping(tomato());
        // fails to compile. Cheese is not free
//        Burger failure = burger().with(beef()).andFree().topping(cheese());

        Burger secondLunch = burger()
                .vegetarian()
                .with(mushroom())
                .and(cheese());

        Burger thirdLunch = burger()
                .with(beef())
                .and(bacon());

//        Burger failure = burger()
//                .vegetarian()
//                .with(beef()) // fails to compile. Beef is not vegetarian.
//                .and(cheese());
    }
}
 