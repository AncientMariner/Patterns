package org.xander.creational.factory.abstractfactory.factories;

import org.xander.creational.factory.abstractfactory.ingredients.clams.Clams;
import org.xander.creational.factory.abstractfactory.ingredients.cheese.Cheese;
import org.xander.creational.factory.abstractfactory.ingredients.dough.Dough;
import org.xander.creational.factory.abstractfactory.ingredients.sauce.Sauce;
import org.xander.creational.factory.abstractfactory.ingredients.pepperoni.Pepperoni;
import org.xander.creational.factory.abstractfactory.ingredients.vegetables.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
