import desc.sort.DescOrder;
import element.checker.NumberChecker;
import fruits.operation.Fruits;
import same.elements.SameElement;

public class AppRunner {
    public void runAllMethods() {
        NumberChecker list = new NumberChecker();
        list.numListAdd();
        list.numListRemove();

        Fruits fruits = new Fruits();
        fruits.addFruits();
        fruits.fruitsChange();

        SameElement SameElement = new SameElement();
        SameElement.numListsAdd();
        SameElement.numListsCheck();

        DescOrder DescOrder = new DescOrder();
        DescOrder.numbersAdd();
        DescOrder.numbersShow();
    }
}
