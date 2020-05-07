public class PositiveSum {
    public static void main(String[] args) {

        int[] array = {26, 64, -52, -40, 70, -39, 34, -93};
        System.out.println("Our array: ");
        printArray(array);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("\n");
        System.out.println("Sum of positive numbers = " + sum);
    }

    private static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {

            System.out.print(array[index] + " ");
        }
    }
}
