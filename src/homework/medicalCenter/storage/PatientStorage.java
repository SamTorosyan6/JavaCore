package homework.medicalCenter.storage;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PatientStorage implements Serializable {

    private List<Patient> patients = new ArrayList<>();

    public void add(Patient patient) {
        patients.add(patient);
    }

    public void printAllPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    public void printPatientsByDoctor(Doctor doctor) {

        boolean found = false;

        for (Patient patient : patients) {
            if (patient.getDoctor().equals(doctor)) {
                System.out.println(patient);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No patients registered for this doctor");
        }
    }

//    public Doctor getDoctorById(int doctorId) {
//        for (Patient patient : patients) {
//            if (patient.getDoctor().getId() == doctorId) {
//                return patient.getDoctor();
//            }
//        }
//
//        return null;
//    }

}
