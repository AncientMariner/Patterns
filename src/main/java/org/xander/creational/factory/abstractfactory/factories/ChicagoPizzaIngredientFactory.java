package org.xander.creational.factory.abstractfactory.factories;

import org.xander.creational.factory.abstractfactory.ingredients.cheese.CheddarCheese;
import org.xander.creational.factory.abstractfactory.ingredients.clams.Clams;
import org.xander.creational.factory.abstractfactory.ingredients.clams.FrozenClams;
import org.xander.creational.factory.abstractfactory.ingredients.cheese.Cheese;
import org.xander.creational.factory.abstractfactory.ingredients.pepperoni.Pepperoni;
import org.xander.creational.factory.abstractfactory.ingredients.pepperoni.SlicedPepperoni;
import org.xander.creational.factory.abstractfactory.ingredients.vegetables.Mozzarella;
import org.xander.creational.factory.abstractfactory.ingredients.dough.Dough;
import org.xander.creational.factory.abstractfactory.ingredients.dough.ThickCrustDough;
import org.xander.creational.factory.abstractfactory.ingredients.sauce.PlumTomatoSauce;
import org.xander.creational.factory.abstractfactory.ingredients.sauce.Sauce;
import org.xander.creational.factory.abstractfactory.ingredients.vegetables.*;

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
