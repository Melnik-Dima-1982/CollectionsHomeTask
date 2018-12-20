import java.util.*;

//Пункт 4
public class ManipulateWithList {
    private ZapolnitList zapolnitList = new ZapolnitList(5);
    private LinkedList <String> manipulateList = new LinkedList<>();

    public void putInList() {
        System.out.println("Enter five strings (Enter - end of string):");
        zapolnitList.zapolnitListOfStrings(manipulateList);
    }

    public void manipulate() {
        System.out.println(Arrays.toString(manipulateList.toArray()));
        for (int i = 0; i < 13; i++) {
          manipulateList.add(0, manipulateList.pollLast());
        }
        System.out.println(Arrays.toString(manipulateList.toArray()));
    }
}
