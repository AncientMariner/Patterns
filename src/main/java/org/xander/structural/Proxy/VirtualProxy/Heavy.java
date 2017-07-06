package org.xander.structural.Proxy.VirtualProxy;

public class Heavy {
    public Heavy() {
        System.out.println("heavy created");
    }

    @Override
    public String toString() {
        return "quite heavy";
    }

}
