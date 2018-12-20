import java.util.*;

//Пункт 3
public class DoctorAppointment {

    private LinkedList<String> linkedListOfPatients = new LinkedList<>();

    public void putPatientInList() {
        System.out.println("Enter your name for appointment:");
        int index = 1;
        for (int i = 0; i < 10; i++){
            System.out.print(index + " - ");
            linkedListOfPatients.addFirst(new Scanner(System.in).nextLine());
            index ++;
        }
    }

    public void takeTreatment() {
        for (int i = 0; i < linkedListOfPatients.size(); i++){
            System.out.println("Patient " + linkedListOfPatients.get(i) + " is taking treatment");
        }
    }
}
