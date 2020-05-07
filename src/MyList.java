import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Comparable<T>> {
    private List<T> list = new ArrayList<>();

    public void add(T a) {
        list.add(a);
    }

    public List<T> getList() {
        return this.list;
    }

    public <F extends Number & Comparable<F>> F getMaxNumber(List<F> array) {
        F max = null;
        if (array.isEmpty()) {
            System.out.println("Empty");
        } else {
            max = array.get(0);
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).compareTo(max) > 0) {
                    max = array.get(i);
                }
            }
        }
        return max;
    }

    public <F extends Number & Comparable<F>> F getMinNumber(List<F> array) {
        F min = null;
        if (array.isEmpty()) {
            System.out.println("Empty");
        } else {
            min = array.get(0);
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).compareTo(min) < 0) {
                    min = array.get(i);
                }
            }
        }
        return min;
    }
}
