package Car;

public class Car {
    public void start() {
        System.out.println("Engine is on");
    }

    public void go() {
        System.out.println("Car starts moving");
    }

    public void drive() {
        int speed = 180;
        System.out.println("Speed is " + speed + " km/h");
    }

    public void stop() {
        System.out.println("Car stops");
    }

    public void end() {
        System.out.println("Engine stops");
    }
}
