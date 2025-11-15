package homework.medicalCenter;

import homework.medicalCenter.enums.Profession;
import homework.medicalCenter.storage.DoctorStorage;

import java.util.Scanner;

public class MedicalCenterDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static Boolean isRun = true;
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static Profession[] professions = Profession.values();

    static void main() {

        while (isRun) {

            Commands.printCommands();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    System.out.print("Please input one of these professions:");
                    for (Profession profession : professions) {
                        System.out.print(profession + "  ");
                    }
                    String profession = scanner.nextLine();
                    doctorStorage.searchDoctorByProfession(Profession.valueOf(profession));
                    break;
                case DELETE_DOCTOR_BY_ID:
                    System.out.println("Please input doctor's id");
                    int doctorId = scanner.nextInt();
                    doctorStorage.deleteDoctorById(doctorId);
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    System.out.println("Please input doctor's id");
                    int docId = scanner.nextInt();
                    doctorStorage.changeDoctorById(docId);
            }

        }

    }

}
