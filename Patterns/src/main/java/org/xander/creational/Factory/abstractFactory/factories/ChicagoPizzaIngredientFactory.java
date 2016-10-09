package org.xander.creational.Factory.abstractFactory.factories;

import org.xander.creational.Factory.abstractFactory.ingredients.cheese.CheddarCheese;
import org.xander.creational.Factory.abstractFactory.ingredients.clams.Clams;
import org.xander.creational.Factory.abstractFactory.ingredients.clams.FrozenClams;
import org.xander.creational.Factory.abstractFactory.ingredients.cheese.Cheese;
import org.xander.creational.Factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import org.xander.creational.Factory.abstractFactory.ingredients.pepperoni.SlicedPepperoni;
import org.xander.creational.Factory.abstractFactory.ingredients.vegetables.Mozzarella;
import org.xander.creational.Factory.abstractFactory.ingredients.dough.Dough;
import org.xander.creational.Factory.abstractFactory.ingredients.dough.ThickCrustDough;
import org.xander.creational.Factory.abstractFactory.ingredients.sauce.PlumTomatoSauce;
import org.xander.creational.Factory.abstractFactory.ingredients.sauce.Sauce;
import org.xander.creational.Factory.abstractFactory.ingredients.vegetables.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new CheddarCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new BlackOlives(),
                new EggPlant(),
                new Spinach(),
                new Mozzarella()
        };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FrozenClams();
    }
}
