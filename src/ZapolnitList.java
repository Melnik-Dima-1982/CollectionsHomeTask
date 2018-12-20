
import java.util.*;

public class ZapolnitList {
    private int sizeOfList;


    public ZapolnitList(int sizeList) {
        this.sizeOfList = sizeList;
    }

    public int getSizeOfList() {
        return sizeOfList;
    }

    public void setSizeOfList(int sizeOfList) {
        this.sizeOfList = sizeOfList;
    }

    public void zapolnitListOfStrings (List <String> listOfElements) {
        int index = 1;
        for (int i = 0; i < sizeOfList; i++) {
            System.out.print(index + " - ");
            listOfElements.add(new Scanner(System.in).nextLine());
            index += 1;
        }
    }

    public void zapolnitListOfInteger (List <Integer> listElements) {
        int index = 1;
        for (int i = 0; i < sizeOfList; i++) {
            System.out.print(index + " - ");
            listElements.add(new Scanner(System.in).nextInt());
            index += 1;
        }
    }
}
