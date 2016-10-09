package org.xander.structural.Flyweight;

import java.awt.Color;
import java.awt.Graphics;

public interface Shape {
    void draw(Graphics g, int x, int y, int width, int height, Color color);
}