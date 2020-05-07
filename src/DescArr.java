import java.util.Arrays;
import java.util.Collections;

public class DescArr {
    public static void main(String[] args) {

        Integer[] array = new Integer[]{2, 3, 1, 7, 11};
        System.out.println("Array : " + "\n" + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("array in reverse order: " + "\n" + Arrays.toString(array));
    }
}
