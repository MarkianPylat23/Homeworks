package plane.shapes;

import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;

import java.util.HashMap;

public class Circle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    private HashMap<String, Double> points = new HashMap<>();
    private Double radius;

    public Circle(double x1, double x2, double radius) {
        this.points.put("x1", x1);
        this.points.put("x2", x2);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }

    @Override
    public double calculatePerimeter() {
        return Math.round(Math.PI * Math.pow(radius, 2) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Circle:" + "\n" +
                "Area - " + calculateArea() + " cm\u00B2; " + "\n" +
                "Perimeter - " + calculatePerimeter() + " cm; " + "\n" +
                "Coordinates - " + points + ";" + "\n" +
                "Radius - " + radius + "cm;" + "\n" + "===========";
    }
}
