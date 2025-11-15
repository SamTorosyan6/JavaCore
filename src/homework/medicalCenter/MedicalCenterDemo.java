package homework.medicalCenter;

import homework.medicalCenter.enums.Profession;
import homework.medicalCenter.interfaces.Commands;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.storage.DoctorStorage;
import homework.medicalCenter.storage.PatientStorage;

import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static Boolean isRun = true;
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage = new PatientStorage();
    private static Profession[] professions = Profession.values();

    static void main() {

        while (isRun) {

            Commands.printCommands();
            String command = scanner.nextLine();

            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    System.out.print("Please input one of these professions:");
                    for (Profession profession : professions) {
                        System.out.print(profession + "  ");
                    }
                    System.out.println();
                    String profession = scanner.nextLine();
                    doctorStorage.searchDoctorByProfession(Profession.valueOf(profession.toUpperCase()));
                    break;
                case DELETE_DOCTOR_BY_ID:
                    System.out.println("Please input doctor's id");
                    int doctorId = scanner.nextInt();
                    scanner.nextLine();
                    doctorStorage.deleteDoctorById(doctorId);
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    System.out.println("Please input doctor's id");
                    int docId = scanner.nextInt();
                    doctorStorage.changeDoctorById(docId);
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    System.out.println("Please input doctor's id");
                    int dId = scanner.nextInt();
                    scanner.nextLine();
                    Doctor doc = doctorStorage.getDoctorById(dId);
                    if (doc != null) {
                        patientStorage.printPatientsByDoctor(doc);
                    } else {
                        System.out.println("Doctor not found!");
                    }
                    break;
                case PRINT_ALL_PATIENTS:
                    patientStorage.printAllPatients();
                    break;
            }

        }

    }

    private static void addPatient() {

        System.out.println("Please input doctor's id to register patient:");
        int doctorId = scanner.nextInt();
        scanner.nextLine();
        Doctor doctor = doctorStorage.getDoctorById(doctorId);
        if (doctor == null) {
            System.out.println("Doctor not found!");
            return;
        }
        System.out.println("Please input patient id:");
        int patientId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please input patient's name");
        String patientName = scanner.nextLine();
        System.out.println("Please input patient's surname");
        String patientSurname = scanner.nextLine();
        System.out.println("Please input patient's phone number");
        int phoneNumber = scanner.nextInt();

        Date date = new Date();
        Patient patient = new Patient(patientId, patientName, patientSurname, phoneNumber, doctor, date);

        patientStorage.add(patient);
        System.out.println("Patient registered successfully!");

    }

    private static void addDoctor() {

        System.out.println("Please input doctor's id:");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (doctorStorage.getDoctorById(id) != null) {
            System.out.println("Doctor with this ID already exists!");
            return;
        }

        System.out.println("Please input doctor's name:");
        String name = scanner.nextLine();

        System.out.println("Please input doctor's surname:");
        String surname = scanner.nextLine();

        System.out.println("Please input doctor's email:");
        String email = scanner.nextLine();

        System.out.println("Please input doctor's phone number:");
        int phone = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please choose doctor's profession from list:");
        for (Profession p : professions) {
            System.out.print(p + "  ");
        }
        System.out.println();

        String profStr = scanner.nextLine();
        Profession profession;

        try {
            profession = Profession.valueOf(profStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid profession!");
            return;
        }

        Doctor doctor = new Doctor(id, name, surname, email, phone, profession);
        doctorStorage.add(doctor);

        System.out.println("Doctor added successfully!");
    }


}
