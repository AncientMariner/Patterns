package org.xander.behavioral.Iterator;

import java.util.Iterator;

public interface Menu {
    void addItem(String name, String description, boolean vegetarian, double price);
    Iterator createIterator();
}
