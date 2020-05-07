package numbers;

public class Calculation {
    public void operateNumbers() {
        Operation multiply = (int x, int y) -> System.out.println("Multiply: " + (y * x));
        Operation add = (int x, int y) -> System.out.println("Adding: " + (x + y));
        Operation divide = (int x, int y) -> System.out.println("Dividing: " + (x / y));

        multiply.abstractVariables(5, 7);
        add.abstractVariables(15, 20);
        divide.abstractVariables(175, 5);
    }
}
