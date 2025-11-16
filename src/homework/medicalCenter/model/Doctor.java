package homework.medicalCenter.model;

import homework.medicalCenter.enums.Profession;

import java.io.Serializable;
import java.util.Objects;

public class Doctor extends Person implements Serializable {

    private String email;
    private Profession profession;

    public Doctor() {
    }

    public Doctor(int id, String name, String surname, String email, int phoneNumber, Profession profession) {

        super(id, name, surname, phoneNumber);
        this.profession = profession;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) && profession == doctor.profession;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, profession);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", profession=" + profession +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
