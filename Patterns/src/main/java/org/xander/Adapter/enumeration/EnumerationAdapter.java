package org.xander.Adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdapter implements Enumeration {
    Iterator iterator;

    public EnumerationAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
