package org.xander.Singleton;

public class DoubleCheckedLockingSingleton {
    private volatile static DoubleCheckedLockingSingleton uniqueInstance;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
