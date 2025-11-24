package homework.medicalCenter.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Patient extends Person implements Serializable {

    Doctor doctor;
    Date registerDateTime;
    User user;

    public Patient() {
    }

    public Patient(int id, String name, String surname, int phoneNumber, Doctor doctor, Date registerDateTime,User user) {
        super(id, name, surname, phoneNumber);
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
        this.user = user;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(doctor, patient.doctor) && Objects.equals(registerDateTime, patient.registerDateTime) && Objects.equals(user, patient.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), doctor, registerDateTime, user);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "doctor=" + doctor +
                ", registerDateTime=" + registerDateTime +
                ", user=" + user +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
