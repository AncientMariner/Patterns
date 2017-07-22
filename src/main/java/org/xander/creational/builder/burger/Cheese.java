package org.xander.creational.builder.burger;

interface Cheese extends VegetarianTopping {
    static Cheese cheese() {
        return null;
    }
}