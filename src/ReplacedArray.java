public class ReplacedArray {
    public static void main(String[] args) {

        int[] array = {535, 555, 578, 45, 49, 5, 32, 5};
        System.out.println("Our array: ");
        printArray(array);
        float average = 0;
        float sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        average = sum / array.length;
        sum = (float) (Math.round(sum * 100.0) / 100.0);
        System.out.println("\n");
        System.out.println("Average is " + average);
    }

    public static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {

            System.out.print(array[index] + " ");
        }

    }
}
