import java.util.*;

public class SearchMinAndMaxInCollection {

    public int searchIndexMaxString (List <String> listOfElements) {
        int indexMaxString = 0;
        int lengthMaxString = 0;
        for (int i = 0; i < listOfElements.size(); i++) {
            if (listOfElements.get(i).length() > lengthMaxString) {
                indexMaxString = i;
                lengthMaxString = listOfElements.get(indexMaxString).length();
            }
        }
        return indexMaxString;
    }

    public int searchIndexMinString (List<String> listElements) {
        int indexMinString = 0;
        int lengthMinString = listElements.get(indexMinString).length();
        for (int i = 0; i < listElements.size(); i++) {
            if (listElements.get(i).length() < lengthMinString) {
                indexMinString = i;
                lengthMinString = listElements.get(indexMinString).length();
            }

        }
        return indexMinString;
    }
}
