import java.util.ArrayList;

//Пункт 8
public class MamaMilaRamu {

    private ArrayList <String> mamaMilaRamu = new ArrayList<>(6);

    public MamaMilaRamu (){
        mamaMilaRamu.add("Mama");
        mamaMilaRamu.add("мыла");
        mamaMilaRamu.add("раму.");
    }

    public void dobavitSlovo ( String dobavlenoeSlovo){
        for (int i = 1; i < 6; i+=2){
            mamaMilaRamu.add(i, dobavlenoeSlovo);
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(mamaMilaRamu.get(i) + '\n');
        }
    }
}
