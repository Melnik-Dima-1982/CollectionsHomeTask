import java.util.*;

//Пункт 10
public class Exo {
    private ZapolnitList dobavit = new ZapolnitList(10);
    private ArrayList<String> exoList = new ArrayList<>(dobavit.getSizeOfList());

    public Exo() {
        System.out.println("Enter 10 strings:");
        dobavit.zapolnitListOfStrings(exoList);
    }

    public void doubleValues () {
        ListIterator <String> exoIter = exoList.listIterator();
        while (exoIter.hasNext()){
            String word = exoIter.next();
            exoIter.set(word + " - " + word);
        }
        System.out.println(Arrays.toString(exoList.toArray()));
    }
}
