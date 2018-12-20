import java.util.*;

//Пункт 9
public class ExperimentalMethodFix {
    private ZapolnitList zapolnitList = new ZapolnitList(4);
    private ArrayList<String> listWithMethodFix = new ArrayList<>(zapolnitList.getSizeOfList());

    public ExperimentalMethodFix() {
        System.out.println("Enter 10 strings:");
        zapolnitList.zapolnitListOfStrings(listWithMethodFix);
    }

    public void fix(String itemForDelete, String itemForInsert) {
        ListIterator<String> listIter = listWithMethodFix.listIterator();
        while (listIter.hasNext()) {
            String word = listIter.next();
            if (word.contains(itemForDelete)) {
                listIter.remove();
            }

            if (word.contains(itemForInsert)) {
                listIter.add(word);
            }
        }
        System.out.println(Arrays.toString(listWithMethodFix.toArray()));
    }
}
