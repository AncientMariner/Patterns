package org.xander.creational.Factory.abstractFactory.factories;

import org.xander.creational.Factory.abstractFactory.ingredients.clams.Clams;
import org.xander.creational.Factory.abstractFactory.ingredients.cheese.Cheese;
import org.xander.creational.Factory.abstractFactory.ingredients.dough.Dough;
import org.xander.creational.Factory.abstractFactory.ingredients.sauce.Sauce;
import org.xander.creational.Factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import org.xander.creational.Factory.abstractFactory.ingredients.vegetables.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
