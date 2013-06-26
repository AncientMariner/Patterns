package org.xander.Singleton;

public class EagerlyCreatedSingleton {
    private static EagerlyCreatedSingleton uniqueInstance = new EagerlyCreatedSingleton();

    private EagerlyCreatedSingleton() {
    }

    public static EagerlyCreatedSingleton getInstance() {
        return uniqueInstance;
    }
}
