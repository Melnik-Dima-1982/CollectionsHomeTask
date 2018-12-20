import java.util.ArrayList;

//Пункт 5
public class firsMinOrMaxString {

    private ZapolnitList minOrMax = new ZapolnitList(10);
    private SearchMinAndMaxInCollection search = new SearchMinAndMaxInCollection();
    private ArrayList<String> minOrMaxString = new ArrayList<>(minOrMax.getSizeOfList());

    public void putStringsInList() {
        System.out.println("Enter ten strings (Enter - end of string):");
        minOrMax.zapolnitListOfStrings(minOrMaxString);
    }

    public void firstMinOrMaxString() {
        int indexMinString = search.searchIndexMinString(minOrMaxString);
        int indexMaxString = search.searchIndexMaxString(minOrMaxString);

        if (indexMinString < indexMaxString) {
            System.out.println("Самая короткая строка встречается раньше, чем самая длиная");
        } else {
            System.out.println("Самая длиная строка встречается раньше, чем самая короткая");
        }
    }
}
