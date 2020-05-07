import plane.shapes.Circle;
import plane.shapes.Rectangle;
import plane.shapes.Triangle;
import space.shapes.Cuboid;
import space.shapes.Sphere;
import space.shapes.SquarePyramid;

public class Data {
    public void populateShapeArray(){
        Shape[] geometricShapes = {
                new Circle(5, 9, 80),
                new Rectangle(6, 12, 43.54, 25.98),
                new Triangle(15, 45, 24, 3, 67, 47),
                new SquarePyramid(5, 5, 25, 30.65),
                new Cuboid(3, 5, 15, 30, 60.87),
                new Sphere(23, 13, 52.78)
        };
        System.out.println("All Geometric Shapes : ");
        for (Shape geometricShape : geometricShapes) {
            System.out.println(geometricShape);
        }
    }
}
