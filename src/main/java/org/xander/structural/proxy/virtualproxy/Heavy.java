package org.xander.structural.proxy.virtualproxy;

public class Heavy {
    public Heavy() {
        System.out.println("heavy created");
    }

    @Override
    public String toString() {
        return "quite heavy";
    }

}
