package desc.sort;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class DescOrder {
    SortedSet<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());

    public void numbersAdd() {
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
    }

    public void numbersShow() {
        System.out.println("Desc sorted numbers : " + numbers + "\n");
    }
}
