package org.xander.structural.PrivateClass;

import java.awt.*;

public class PrivateClass {
    public class CircleSpecs {
        private double radius;
        private Point center;

        public CircleSpecs(double radius, Point center) {
            this.radius = radius;
            this.center = center;
        }

        public double getRadius() {
            return radius;
        }

        public Point getCenter() {
            return center;
        }
    }

    public class Circle {
        private CircleSpecs circleSpecs;

        public Circle(double radius, Point center) {
            this.circleSpecs = new CircleSpecs(radius, center);
        }

        public double circumference() {
            return circleSpecs.radius * Math.PI;
        }

        public double diameter() {
            return circleSpecs.radius * 2;
        }
    }
 }
