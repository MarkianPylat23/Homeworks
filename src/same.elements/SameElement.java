package same.elements;

import java.util.ArrayList;
import java.util.List;

public class SameElement {
    List<Integer> numList1 = new ArrayList<>();
    List<Integer> numList2 = new ArrayList<>();

    public void numListsAdd() {

        numList1.add(3);
        numList1.add(9);
        numList1.add(11);
        numList1.add(18);
        numList1.add(20);
        numList1.add(22);
        numList1.add(45);
        numList1.add(65);

        numList2.add(4);
        numList2.add(9);
        numList2.add(11);
        numList2.add(19);
        numList2.add(21);
        numList2.add(22);
        numList2.add(67);
        numList2.add(45);
    }

    public void numListsCheck() {

        System.out.println(numList1);
        System.out.println(numList2);
        System.out.println("The similar numbers are:");
        for (Integer integer : numList1) {
            for (Integer value : numList2) {
                if (integer.equals(value)) {
                    System.out.println(integer);
                }
            }
        }
        System.out.println("\n");
    }
}
