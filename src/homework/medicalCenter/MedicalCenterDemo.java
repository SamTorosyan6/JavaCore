package homework.medicalCenter;

import homework.medicalCenter.enums.Profession;
import homework.medicalCenter.interfaces.Commands;
import homework.medicalCenter.interfaces.Login;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.User;
import homework.medicalCenter.storage.DoctorStorage;
import homework.medicalCenter.storage.PatientStorage;
import homework.medicalCenter.storage.UserStorage;
import homework.medicalCenter.util.FileUtil;

import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands, Login {

    private static Scanner scanner = new Scanner(System.in);
    private static Boolean isRun = true;
    private static Boolean isRunLogin = true;
    private static DoctorStorage doctorStorage = FileUtil.deserializeDoctorStorage();
    private static PatientStorage patientStorage = FileUtil.deserializePatientStorage();
    private static Profession[] professions = Profession.values();
    private static UserStorage userStorage = FileUtil.deserializeUserStorage();
    private static User loggedUser;

    static void main() {

        while (true) {

            isRunLogin = true;
            loggedUser = null;

            while (isRunLogin) {

                Login.printCommands();
                String loginCommand = scanner.nextLine();

                switch (loginCommand) {

                    case Login.EXIT:
                        isRunLogin = false;
                        isRun = false;
                        break;
                    case ADD_USER:
                        addUser();
                        FileUtil.serializeUserData(userStorage);
                        break;
                    case LOGIN:
                        loggedUser = login();
                        FileUtil.serializeUserData(userStorage);
                        if (loggedUser != null) {
                            isRunLogin = false;
                            break;
                        }
                        break;
                }

            }

            isRun = true;

            while (isRun) {
                if (!isRun == false) {
                    Commands.printCommands();
                    String command = scanner.nextLine();
                    switch (command) {
                        case Commands.EXIT:
                            isRun = false;
                            break;
                        case ADD_DOCTOR:
                            addDoctor();
                            FileUtil.serializeDoctorData(doctorStorage);
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
                            FileUtil.serializeDoctorData(doctorStorage);
                            break;
                        case CHANGE_DOCTOR_BY_ID:
                            System.out.println("Please input doctor's id");
                            int docId = scanner.nextInt();
                            doctorStorage.changeDoctorById(docId, loggedUser);
                            FileUtil.serializeDoctorData(doctorStorage);
                            break;
                        case ADD_PATIENT:
                            addPatient();
                            FileUtil.serializePatientData(patientStorage);
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
                        case LOGOUT:
                            isRun = false;
                            break;
                    }
                }
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
        scanner.nextLine();
        Date date = new Date();
        Patient patient = new Patient(patientId, patientName, patientSurname, phoneNumber, doctor, date, loggedUser);

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

        Doctor doctor = new Doctor(id, name, surname, email, phone, profession, loggedUser);
        doctorStorage.add(doctor);

    }

    private static void addUser() {
        System.out.println("Please input user's name:");
        String name = scanner.nextLine();
        System.out.println("Please input user's surname:");
        String surname = scanner.nextLine();
        System.out.println("Please input user's email:");
        String email = scanner.nextLine();
        System.out.println("Please input user's password:");
        String password = scanner.nextLine();

        User user = new User(name, surname, email, password);
        userStorage.addUser(user);
    }

    private static User login() {
        System.out.println("Please input your login (email)");
        String login = scanner.nextLine();

        System.out.println("Please input your password");
        String password = scanner.nextLine();

        return userStorage.login(login, password);
    }

}
