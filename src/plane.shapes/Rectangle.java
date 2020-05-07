package plane.shapes;

import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;

import java.util.HashMap;

public class Rectangle extends PlaneShape implements PerimeterMeasurable, AreaMeasurable {

    private HashMap<String, Double> points = new HashMap<>();
    private Double width;
    private Double height;

    public Rectangle(double x1, double x2, double width, double height) {
        this.points.put("x1", x1);
        this.points.put("x2", x2);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return Math.round(width * height * 100.0) / 100.0;
    }

    @Override
    public double calculatePerimeter() {
        return Math.round(2 * (width + height) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Rectangle:" + "\n" +
                "Area - " + calculateArea() + " cm\u00B2; " + "\n" +
                "Perimeter - " + calculatePerimeter() + " cm; " + "\n" +
                "Coordinates - " + points + ";" + "\n" +
                "Width - " + width + "cm; " + "\n" +
                "Height - " + height + "cm;" + "\n" + "===========";
    }
}
