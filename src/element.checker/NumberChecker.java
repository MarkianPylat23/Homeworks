package element.checker;

import java.util.ArrayList;
import java.util.List;

public class NumberChecker {
    List<Integer> numList = new ArrayList<>();

    public void numListAdd() {

        numList.add(3);
        numList.add(9);
        numList.add(11);
        numList.add(18);
        numList.add(20);
        numList.add(22);
    }

    public void numListRemove() {
        System.out.println("Normal List" + numList);
        numList.removeIf(integer -> integer % 3 == 0);
        System.out.println("After Removing: " + numList + "\n");
    }
}
