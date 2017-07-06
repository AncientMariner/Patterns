package org.xander.structural.Proxy.VirtualProxy;

import java.util.function.Supplier;

public class Holder {
    private Supplier<Heavy> heavy = () -> createAndCacheHeavy();
//    private Supplier<Heavy> heavy = Heavy::new;

    public Holder() {
        System.out.println("holder created");
    }

    public Heavy getHeavy() {
        return heavy.get();
    }

    private synchronized Heavy createAndCacheHeavy() {
        class HeavyFactory implements Supplier<Heavy> {
            private final Heavy heavyInstance = new Heavy();

            public Heavy get() {
                return heavyInstance;
            }
        }

        if (!HeavyFactory.class.isInstance(heavy)) {
            heavy = new HeavyFactory();
        }
        return heavy.get();
    }

    public static void main(String[] args) {
        Holder holder = new Holder();
        System.out.println(holder.getHeavy());
        System.out.println(holder.getHeavy());
    }
}
