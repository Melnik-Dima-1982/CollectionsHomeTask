import java.util.ArrayList;

//Пункт 6
public class Zoluhka {

    private ZapolnitList zapolnitList = new ZapolnitList(20);
    private ArrayList<Integer> startList = new ArrayList<>(zapolnitList.getSizeOfList());
    private ArrayList<Integer> numsDelitNaThree = new ArrayList<>();
    private ArrayList<Integer> numsDelitNaTwo = new ArrayList<>();
    private ArrayList<Integer> numsNeDelit = new ArrayList<>();

    public void putNumsInList() {
        System.out.println("Enter twenty nums:");
        zapolnitList.zapolnitListOfInteger(startList);
    }

    private boolean delitNaThree(int num) {

        if (num % 3 == 0) {
            return true;
        } else return false;
    }

    private boolean delitNaTwo(int num) {

        if (num % 2 == 0) {
            return true;
        } else return false;
    }

    public void sortirovkaNums() {
        for (int y : startList) {
            if (delitNaThree(y)) {
                numsDelitNaThree.add(y);
            }
            if (delitNaTwo(y)) {
                numsDelitNaTwo.add(y);
            }
            if (!delitNaThree(y) && !delitNaTwo(y)) {
                numsNeDelit.add(y);
            }
        }
    }
}
