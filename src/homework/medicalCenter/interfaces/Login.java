package homework.medicalCenter.interfaces;

public interface Login {

    String ADD_USER = "1";
    String LOGIN = "2";
    String EXIT = "0";

    static void printCommands() {
        System.out.println("Input " + ADD_USER + " for REGISTER");
        System.out.println("Input " + LOGIN + " for LOGIN");
        System.out.println("Input " + EXIT + " for EXIT");
    }

}
