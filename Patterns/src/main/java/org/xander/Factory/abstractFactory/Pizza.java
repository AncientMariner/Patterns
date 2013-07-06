package org.xander.Factory.abstractFactory;

import org.xander.Factory.abstractFactory.ingredients.clams.Clams;
import org.xander.Factory.abstractFactory.ingredients.cheese.Cheese;
import org.xander.Factory.abstractFactory.ingredients.dough.Dough;
import org.xander.Factory.abstractFactory.ingredients.sauce.Sauce;
import org.xander.Factory.abstractFactory.ingredients.pepperoni.Pepperoni;
import org.xander.Factory.abstractFactory.ingredients.vegetables.Veggies;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza";
    }
}
