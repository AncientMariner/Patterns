package org.xander.structural.Bridge;

public class BridgePatternTest {

    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        new Pentagon(new GreenColor()).applyColor();
    }
}