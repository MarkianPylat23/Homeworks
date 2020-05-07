package plane.shapes;

import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.HashMap;

public class Triangle extends Shape implements PerimeterMeasurable, AreaMeasurable {
    private HashMap<String, Double> points = new HashMap<>();

    private Double area;
    private Double side1;
    private Double side2;
    private Double side3;
    private Double perimeter;

    public Triangle(double x1, double x2, double y1, double y2, double z1, double z2) {
        this.points.put("x1", x1);
        this.points.put("y1", y1);
        this.points.put("y2", y2);
        this.points.put("z1", z1);
        this.points.put("z2", z2);

        side1 = Point2D.distance(x1, x2, y1, y1);
        side2 = Point2D.distance(y1, y2, z1, z2);
        side3 = Point2D.distance(x1, x2, z1, z2);

        perimeter = (side1 + side2 + side3);
        area = Math.sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3));
        area = Math.round(area * 100.0) / 100.0;
    }

    @Override
    public double calculatePerimeter() {

        return Math.round((side1 + side2 + side3) * 100.0) / 100.0;
    }

    @Override
    public double calculateArea() {

        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public String toString() {

        return "Triangle:" + "\n" +
                "Area - " + calculateArea() + " cm\u00B2; " + "\n" +
                "Perimeter - " + calculatePerimeter() + " cm; " + "\n" +
                "Coordinates - " + points + "; " + "\n" +
                "First side - " + Math.round(side1 * 100.0) / 100.0 + "cm; " + "\n" +
                "Second side - " + Math.round(side2 * 100.0) / 100.0 + "cm; " + "\n" +
                "Third side";
    }
}
