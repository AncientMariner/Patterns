package org.xander.Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    Iterator iterator = null;
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    String getDescription() {
        return description;
    }

    public Iterator createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }

    @Override
    void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("------------------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
