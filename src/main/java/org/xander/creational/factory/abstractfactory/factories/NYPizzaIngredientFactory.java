package org.xander.creational.factory.abstractfactory.factories;

import org.xander.creational.factory.abstractfactory.ingredients.clams.Clams;
import org.xander.creational.factory.abstractfactory.ingredients.clams.FreshClams;
import org.xander.creational.factory.abstractfactory.ingredients.cheese.Cheese;
import org.xander.creational.factory.abstractfactory.ingredients.cheese.ReggianoCheese;
import org.xander.creational.factory.abstractfactory.ingredients.dough.Dough;
import org.xander.creational.factory.abstractfactory.ingredients.dough.ThinCrustDough;
import org.xander.creational.factory.abstractfactory.ingredients.pepperoni.Pepperoni;
import org.xander.creational.factory.abstractfactory.ingredients.pepperoni.SlicedPepperoni;
import org.xander.creational.factory.abstractfactory.ingredients.sauce.ReggianoSauce;
import org.xander.creational.factory.abstractfactory.ingredients.sauce.Sauce;
import org.xander.creational.factory.abstractfactory.ingredients.vegetables.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new ReggianoSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()
        };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
