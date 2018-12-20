import java.util.*;

//пункты 1 и 2
public class StringsList {

    private ZapolnitList zapolnitList = new ZapolnitList(5);
    private SearchMinAndMaxInCollection search = new SearchMinAndMaxInCollection();
    ArrayList<String> listOfStrings = new ArrayList<>(zapolnitList.getSizeOfList());

    public void dobavitElementsInList() {
        System.out.println("Enter five strings (Enter - end of string):");
        zapolnitList.zapolnitListOfStrings(listOfStrings);
    }

    public String searchFirstMaxString() {
        return listOfStrings.get(search.searchIndexMaxString(listOfStrings));
    }

    public void searchAllMaxStrings() {
        for (String y : listOfStrings) {
            if (y.length() == searchFirstMaxString().length()) {
                System.out.println(y);
            }
        }
    }

    public String searchFirstMinString() {
        return listOfStrings.get(search.searchIndexMinString(listOfStrings));
    }

    public void searchAllMinStrings() {
        for (String y : listOfStrings) {
            if (y.length() == searchFirstMinString().length()) {
                System.out.println(y);
            }
        }
    }
}