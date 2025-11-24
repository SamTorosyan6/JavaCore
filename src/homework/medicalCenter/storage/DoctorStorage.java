package homework.medicalCenter.storage;

import homework.medicalCenter.enums.Profession;
import homework.medicalCenter.exceptions.DoctorNotFoundException;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorStorage implements Serializable {

    private List<Doctor> doctors = new ArrayList<>();

    public void add(Doctor doctor) {

        boolean doctorFound = false;

        for (Doctor d : doctors) {
            if (doctor.getId() == d.getId()) {
                doctorFound = true;
                System.err.println("There is already a doctor registered with id: " + doctor.getId());
                System.err.println(d.toString());
                return;
            }
        }

        if (!doctorFound) {
            doctors.add(doctor);
            System.out.println("Doctor added successfully!");
        }
    }

    public void searchDoctorByProfession(Profession profession) throws DoctorNotFoundException {

        boolean found = false;

        for (Doctor doctor : doctors) {
            if (doctor.getProfession() == profession) {
                System.out.println(doctor.toString());
                found = true;
            }
        }
        if (!found) {
            System.err.println("No doctors found with level: " + profession);
        }

    }

    public void deleteDoctorById(int doctorId) {

        boolean doctorFound = false;

        for (Doctor doctor : doctors) {
            if (doctor.getId() == doctorId) {
                doctorFound = true;
                doctors.remove(doctor);
                System.out.println("The doctor by id " + doctorId + " deleted.");
                break;
            }
        }

        if (!doctorFound) {
            throw new DoctorNotFoundException("No doctor found with id " + doctorId);
        }

    }

    public void changeDoctorById(int docId, User loggedUser) {

        Scanner scanner = new Scanner(System.in);

        for (Doctor doctor : doctors) {

            if (doctor.getId() == docId) {

                System.out.println("The doctor found" + doctor.toString());
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

                Doctor newDoctor = new Doctor(doctor.getId(), doctorName, doctorSurname, email, phoneNumber, newProfession,loggedUser);
                doctor = newDoctor;
                System.out.println("Doctor updated successfully!");
                return;
            }

        }

        throw new DoctorNotFoundException("No doctor found with id " + docId);

    }

    public Doctor getDoctorById(int doctorId) {

        for (Doctor doctor : doctors) {
            if (doctor.getId() == doctorId) {
                return doctor;
            }
        }
        return null;
    }

}

