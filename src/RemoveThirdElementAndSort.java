import java.util.*;

//Пункт 7
public class RemoveThirdElementAndSort {

    private ZapolnitList dobavlenie = new ZapolnitList(5);
    private ArrayList<String> removedList = new ArrayList<>(dobavlenie.getSizeOfList());


    public void zapolnitList() {
        System.out.println("Enter 5 string (Enter - end of string):");
        dobavlenie.zapolnitListOfStrings(removedList);
    }

    public void changeMassive(int indexRemovedElement) {
        removedList.remove(indexRemovedElement);
        Collections.reverse(removedList);
        System.out.println(Arrays.toString(removedList.toArray()));
    }
}
