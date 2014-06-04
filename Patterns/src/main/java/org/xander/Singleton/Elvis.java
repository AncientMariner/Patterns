package org.xander.Singleton;


/**
 * Provides an ironclad guarantee against multiple instantiation, even in the face of sophisticated
 serialization or reflection attacks. With the Enum Singleton Serialization is guaranteed by the JVM
 */
public enum Elvis {
    INSTANCE;
    public void leaveTheBuilding() {
        System.out.println("Elvis is leaving the building. Long live the king!");
    }
}
