package org.xander.creational.builder.burger;

interface Tomato extends VegetarianTopping, FreeTopping {
    static Tomato tomato() {
        return null;
    }
}
