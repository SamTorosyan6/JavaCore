package homework.medicalCenter.interfaces;

public interface UserPageCommands {

    String EXIT = "0";
    String SEARCH_DOCTOR_BY_PROFESSION = "1";
    String ADD_PATIENT = "2";

    static void printUserCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for SEARCH DOCTOR BY PROFESSION");
        System.out.println("Please input " + ADD_PATIENT + " for REGISTER WITH A DOCTOR");
    }

}
