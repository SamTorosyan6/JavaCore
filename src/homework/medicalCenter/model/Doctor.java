package homework.medicalCenter.model;

import homework.medicalCenter.enums.Profession;

import java.io.Serializable;
import java.util.Objects;

public class Doctor extends Person implements Serializable {

    private String email;
    private Profession profession;
    User user;

    public Doctor() {
    }

    public Doctor(int id, String name, String surname, String email, int phoneNumber, Profession profession, User user) {
        super(id, name, surname, phoneNumber);
        this.profession = profession;
        this.email = email;
        this.user = user;
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
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) && profession == doctor.profession && Objects.equals(user, doctor.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, profession, user);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", profession=" + profession +
                ", user=" + user +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
