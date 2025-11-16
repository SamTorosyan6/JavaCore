package homework.medicalCenter.util;

import homework.medicalCenter.storage.DoctorStorage;
import homework.medicalCenter.storage.PatientStorage;

import java.io.*;

public abstract class FileUtil {

    private static final String PATIENT_DATA_FILE = "C:\\Users\\samve\\IdeaProjects\\JavaCore\\src\\homework\\medicalCenter\\data\\patientData.data";
    private static final String DOCTOR_DATA_FILE = "C:\\Users\\samve\\IdeaProjects\\JavaCore\\src\\homework\\medicalCenter\\data\\doctorData.data";

    public static void serializePatientData(PatientStorage patientStorage) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(PATIENT_DATA_FILE))) {
            objectOutputStream.writeObject(patientStorage);
        } catch (FileNotFoundException e) {
            System.out.println("File not found for patient data " + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize patient data " + e);
        }

    }

    public static void serializeDoctorData(DoctorStorage doctorStorage) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(DOCTOR_DATA_FILE))) {
        objectOutputStream.writeObject(doctorStorage);
        } catch (FileNotFoundException e) {
            System.out.println("File not found for doctor data " + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize doctor data " + e);
        }

    }

    public static PatientStorage deserializePatientStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PATIENT_DATA_FILE))) {
            Object object = objectInputStream.readObject();
            if(object instanceof PatientStorage patientStorage){
                return patientStorage;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found for patient data " + e);
        } catch (IOException e) {
            System.out.println("Failed to deSerialize patient data " + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return new PatientStorage();
    }

    public static DoctorStorage deserializeDoctorStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DOCTOR_DATA_FILE))) {
            Object object = objectInputStream.readObject();
            if(object instanceof DoctorStorage doctorStorage){
                return doctorStorage;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found for doctor data " + e);
        } catch (IOException e) {
            System.out.println("Failed to deSerialize doctor data " + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return new DoctorStorage();
    }
}
