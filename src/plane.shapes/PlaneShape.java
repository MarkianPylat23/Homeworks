package plane.shapes;

import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;

import java.awt.*;

abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    private double area;
}
