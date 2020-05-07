package space.shapes;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;

import java.awt.*;
import java.util.HashMap;

public class Sphere extends Shape implements AreaMeasurable, VolumeMeasurable {
    private HashMap<String, Double> points = new HashMap<>();
    private double radius;

    public Sphere(double x1, double x2, double radius) {
        this.points.put("x1", x1);
        this.points.put("x2", x2);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.round(4 * Math.PI * Math.pow(radius, 2) );
    }

    @Override
    public double calculateVolume() {
        return Math.round(4 * Math.PI * Math.pow(radius, 3) / 3 * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Sphere:" + "\n" +
                "Area - " + calculateArea() + "cm\u00B2; " + "\n" +
                "Volume - " + calculateVolume() + "cm\u00B3; " + "\n" +
                "Coordinates - " + points + "; " + "\n" +
                "Radius - " + radius + ";" + "\n" + "===========";
    }
}
