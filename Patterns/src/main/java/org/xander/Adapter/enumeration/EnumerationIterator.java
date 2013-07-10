package org.xander.Adapter.enumeration;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIterator implements Iterator {
    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("This operation is not supported");
    }

    public static void main(String[] args) {
        System.out.println("Working with iterator through enumeration");
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        EnumerationAdapter enumerationAdapter = new EnumerationAdapter(arrayList.iterator());
        while(enumerationAdapter.hasMoreElements()) {
            System.out.println(enumerationAdapter.nextElement());
        }

        System.out.println("Working with enumeration through iterator");
        Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        EnumerationIterator enumerationIterator = new EnumerationIterator(vector.elements());
        while(enumerationIterator.hasNext()) {
            System.out.println(enumerationIterator.next());
        }
    }
}
