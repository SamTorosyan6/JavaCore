package homework.medicalCenter.interfaces;

public interface DoctorPageCommands {

    String EXIT = "0";
    String SEARCH_DOCTOR_BY_PROFESSION = "1";
    String ADD_PATIENT = "2";
    String PRINT_ALL_PATIENTS = "3";

    static void printUserCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for SEARCH DOCTOR BY PROFESSION");
        System.out.println("Please input " + ADD_PATIENT + " for ADD PATIENT");
        System.out.println("Please input " + PRINT_ALL_PATIENTS + " for PRINT ALL PATIENTS");
    }

}
