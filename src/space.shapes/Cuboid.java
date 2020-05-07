package space.shapes;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;

import java.awt.*;
import java.util.HashMap;

public class Cuboid extends Shape implements AreaMeasurable, VolumeMeasurable {
    HashMap<String, Double> points = new HashMap<>();
    private Double width;
    private Double height;
    private Double depth;

    public Cuboid(double x1, double x2, double width, double height, double depth) {
        this.points.put("x1", x1);
        this.points.put("x2", x2);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double calculateArea() {
        return Math.round(2 * (width * height + height * depth + width * depth) * 100.0) / 100.0;
    }

    @Override
    public double calculateVolume() {
        return Math.round(width * height * height * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Cuboid:" + "\n" +
                "Area - " + calculateArea() + "cm\u00B2; " + "\n" +
                "Volume - " + calculateVolume() + "cm\u00B3;" + "\n" +
                "Coordinates - " + points + "; " + "\n" +
                "Width - " + width + "cm;" + "\n" +
                "Height - " + height + "cm; " + "\n" +
                "Depth - " + depth + "cm;" + "\n" + "===========";
    }
}
