package org.xander.creational.Builder.burger;

interface Tomato extends VegetarianTopping, FreeTopping {
    static Tomato tomato() {
        return null;
    }
}
