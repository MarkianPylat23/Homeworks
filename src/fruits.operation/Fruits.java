package fruits.operation;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    List<String> fruitList = new ArrayList<>();

    public void addFruits() {
        fruitList.add("Apple");
        fruitList.add("Lemon");
        fruitList.add("Orange");
        fruitList.add("Banana");
        fruitList.add("Watermelon");
        fruitList.add("Strawberry");
    }

    public void fruitsChange() {

        System.out.println("Normal List " + fruitList);

        for (int i = 0; i < fruitList.size(); i++) {

            if (fruitList.get(i).equals("Orange")) {
                fruitList.set(i, "Grapefruit");
                System.out.println("Replaced List " + fruitList + "\n");
            }
        }
    }
}
