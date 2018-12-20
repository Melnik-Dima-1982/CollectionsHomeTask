public class TestCollections {
    public static void main(String[] args) {
//        testStringsList();
//        testDoctorAppointment();
//        testManipulateWithList();
//        testMinAndMaxStrings();
//        testZoluhka();
//        testRemoveThirdElementAndSort();
//        testMamaMilaRamu();
//        testExperimentalMethodFix();
//        testExo();
        testHierarchy();
    }

    public static void testStringsList() {
        StringsList strList = new StringsList();
        strList.dobavitElementsInList();
        System.out.println("First max string - " + strList.searchFirstMaxString());
        System.out.println("All max strings:");
        strList.searchAllMaxStrings();
        System.out.println("First min string - " + strList.searchFirstMinString());
        System.out.println("All min strings:");
        strList.searchAllMinStrings();
    }

    public static void testDoctorAppointment() {
        DoctorAppointment da = new DoctorAppointment();
        da.putPatientInList();
        da.takeTreatment();
    }

    public static void testManipulateWithList() {
        ManipulateWithList manipulate = new ManipulateWithList();
        manipulate.putInList();
        manipulate.manipulate();
    }

    public static void testMinAndMaxStrings() {
        firsMinOrMaxString minAndMaxStrings = new firsMinOrMaxString();
        minAndMaxStrings.putStringsInList();
        minAndMaxStrings.firstMinOrMaxString();
    }

    public static void testZoluhka() {
        Zoluhka zoluhka = new Zoluhka();
        zoluhka.putNumsInList();
        zoluhka.sortirovkaNums();
    }

    public static void testRemoveThirdElementAndSort() {
        RemoveThirdElementAndSort removeThirdElementAndSort = new
                RemoveThirdElementAndSort();
        removeThirdElementAndSort.zapolnitList();
        removeThirdElementAndSort.changeMassive(2);
    }

    public static void testMamaMilaRamu() {
        MamaMilaRamu mamaMilaRamu = new MamaMilaRamu();
        mamaMilaRamu.dobavitSlovo("именно");
    }

    public static void testExperimentalMethodFix() {
        ExperimentalMethodFix experimentalMethodFix = new ExperimentalMethodFix();
        experimentalMethodFix.fix("р", "л");
        System.out.println();
    }

    public static void testExo() {
        Exo exo = new Exo();
        exo.doubleValues();
    }

    public static void testHierarchy() {
        Hierarchy hierarchy = new Hierarchy();
        hierarchy.checkHierarchy();
    }
}
