package homework.medicalCenter.storage;

import homework.medicalCenter.enums.Profession;
import homework.medicalCenter.exceptions.DoctorNotFoundException;
import homework.medicalCenter.model.Doctor;

import java.io.Serializable;
import java.util.Scanner;

public class DoctorStorage implements Serializable {

    private int size;
    private Doctor[] doctors = new Doctor[10];

    public void add(Doctor doctor) {

        boolean doctorFound = false;

        if (size == doctors.length) {
            extend();
        }

        for (int i = 0; i < size; i++) {
            if (doctors[i].getId() == doctor.getId()) {
                doctorFound = true;
                System.err.println("There is already a doctor registered with id: " + doctors[i].getId());
                System.err.println(doctors[i].toString());
                return;
            }
        }

        if (!doctorFound) {
            doctors[size++] = doctor;

        }
    }

    private void extend() {
        Doctor[] tmp = new Doctor[size + 10];
        System.arraycopy(doctors, 0, tmp, 0, size);
        doctors = tmp;
    }

    public void searchDoctorByProfession(Profession profession) throws DoctorNotFoundException {

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession() == profession) {
                System.out.println(doctors[i].toString());
                found = true;
            }
        }
        if (!found) {
            throw new DoctorNotFoundException("No doctors found with level: " + profession);
        }

    }

    public void deleteDoctorById(int doctorId) {

        boolean doctorFound = false;

        for (int i = 0; i < size; i++) {
            if (doctors[i].getId() == doctorId) {
                for (int j = i; j < size - 1; j++) {
                    doctors[j] = doctors[j + 1];
                }
                size--;
                doctorFound = true;
                System.out.println("The doctor by id " + doctorId + " deleted.");
                break;
            }
        }

        if (!doctorFound) {
            throw new DoctorNotFoundException("No doctor found with id " + doctorId);
        }

    }

    public void changeDoctorById(int docId) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++) {

            if (doctors[i].getId() == docId) {

                System.out.println("The doctor found" + doctors[i].toString());
                System.out.println("Please input new doctor's name");
                String doctorName = scanner.nextLine();
                System.out.println("Please input new doctor's surname");
                String doctorSurname = scanner.nextLine();
                System.out.println("Please input new doctor's email");
                String email = scanner.nextLine();
                System.out.println("Please input new doctor's phone number");
                int phoneNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Please input new profession ");
                for (Profession profession : Profession.values()) {
                    System.out.print(profession + "  ");
                }
                System.out.println();
                Profession newProfession = Profession.valueOf(scanner.nextLine().toUpperCase());

                Doctor newDoctor = new Doctor(doctors[i].getId(), doctorName, doctorSurname, email, phoneNumber, newProfession);
                doctors[i] = newDoctor;
                System.out.println("Doctor updated successfully!");
                return;
            }

        }

        throw new DoctorNotFoundException("No doctor found with id " + docId);

    }

    public Doctor getDoctorById(int doctorId) {

        for (int i = 0; i < size; i++) {
            if (doctors[i].getId() == doctorId) {
                return doctors[i];
            }
        }
        return null;
    }

}

