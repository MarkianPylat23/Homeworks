package space.shapes;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;

import java.awt.*;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    private double height;
}
