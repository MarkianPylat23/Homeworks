package Circle;

public class CircleSquare {
    private double radius;

    public CircleSquare() {
        radius = 3.05;
    }

    public double getRadius() {
        double pi = 3.14;
        return (Math.pow(pi, 2 * radius));
    }
}
