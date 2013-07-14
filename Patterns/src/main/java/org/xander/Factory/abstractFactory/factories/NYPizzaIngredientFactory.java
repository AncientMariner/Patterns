package org.xander.Factory.abstractFactory.factories;

import org.xander.Factory.abstractFactory.ingredients.clams.Clams;
import org.xander.Factory.abstractFactory.ingredients.clams.FreshClams;
import org.xander.Factory.abstractFactory.ingredients.cheese.Cheese;
import org.xander.Factory.abstractFactory.ingredients.cheese.ReggianoCheese;
import org.xander.Factory.abstractFactory.ingredients.dough.Dough;
import org.xander.Factory.abstractFactory.ingredients.dough.ThinCrustDough;
import org.xander.Factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import org.xander.Factory.abstractFactory.ingredients.pepperoni.SlicedPepperoni;
import org.xander.Factory.abstractFactory.ingredients.sauce.ReggianoSauce;
import org.xander.Factory.abstractFactory.ingredients.sauce.Sauce;
import org.xander.Factory.abstractFactory.ingredients.vegetables.*;

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
