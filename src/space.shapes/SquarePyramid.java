package space.shapes;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;

import java.awt.*;
import java.util.HashMap;

public class SquarePyramid extends Shape implements AreaMeasurable, VolumeMeasurable {
    private HashMap<String, Double> points = new HashMap<>();
    private double width;
    private double height;

    public SquarePyramid(double x1, double x2, double width, double height) {
        this.points.put("x1", x1);
        this.points.put("x2", x2);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return Math.round(2 * width * (width / (2 + sqrt(Math.pow(height, 2) + Math.pow(width / 2, 2)))) * 100.0) / 100.0;
    }

    @Override
    public double calculateVolume() {
        return Math.round((Math.pow(width, 2) * height) / 3 * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Square pyramid:" + "\n" +
                "Area - " + calculateArea() + "cm\u00B2; " + "\n" +
                "Volume - " + calculateVolume() + "cm\u00B3; " +
                "Coordinates - " + points + "; " + "\n" +
                "Width - " + width + "cm; " + "\n" +
                "Height - " + height + "cm;" + "\n" + "===========";
    }
}
