package Car;

public class Main {
    public static void main(String[] args) {

        Car volkswagen = new Car();
        System.out.println("Welcome to Volkswagen");
        volkswagen.start();
        volkswagen.go();
        volkswagen.drive();
        volkswagen.stop();
        System.out.println("Thanks for a trip!");
    }
}
