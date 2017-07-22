package org.xander.creational.singleton;


/**
 * Provides an ironclad guarantee against multiple instantiation, even in the face of sophisticated
 * serialization or reflection attacks. With the Enum singleton Serialization is guaranteed by the JVM
 */
public enum Elvis {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("Elvis is leaving the building. Long live the king!");
    }
}
