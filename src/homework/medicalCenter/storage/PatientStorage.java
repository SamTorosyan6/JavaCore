package homework.medicalCenter.storage;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;

import java.io.Serializable;

public class PatientStorage implements Serializable {

    private Patient[] patients = new Patient[10];
    private int size = 0;

    public void add(Patient patient) {
        if (size == patients.length) {
            extend();
        }
        patients[size++] = patient;
    }

    private void extend() {
        Patient[] tmp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, size);
        patients = tmp;
    }

    public void printAllPatients() {
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }
    }

    public void printPatientsByDoctor(Doctor doctor) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().equals(doctor)) {
                System.out.println(patients[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No patients registered for this doctor");
        }
    }

    public Doctor getDoctorById(int doctorId) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().getId() == doctorId) {
                return patients[i].getDoctor();
            }
        }
        return null;
    }

}
