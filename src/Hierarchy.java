import java.util.*;

//Пункт 11
public class Hierarchy {

    private ZapolnitList dobavit = new ZapolnitList(10);
    private ArrayList<String> listHierarchy = new ArrayList<>(dobavit.getSizeOfList());

    public Hierarchy() {
        System.out.println("Enter 10 strings:");
        dobavit.zapolnitListOfStrings(listHierarchy);
    }

    public void checkHierarchy() {
        for (int i = 0; i < listHierarchy.size() - 1; i++) {
            if (listHierarchy.get(i).length() > listHierarchy.get(i + 1).length()) {
                String as = listHierarchy.get(i + 1);
                System.out.println("Index of the first element, which breaks the hierarchy - "
                        + (i + 1));
                break;
            } else {
                System.out.println("Hierarchy of increasing");
            }
        }
    }
}
