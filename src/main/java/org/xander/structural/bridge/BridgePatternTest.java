package org.xander.structural.bridge;

public class BridgePatternTest {

    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        new Pentagon(new GreenColor()).applyColor();
    }
}