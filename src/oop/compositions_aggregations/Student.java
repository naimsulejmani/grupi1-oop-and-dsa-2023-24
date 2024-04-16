package oop.compositions_aggregations;

import java.time.LocalDate;

public class Student {
    /*
        Constant should be initialized during object creations via constructor
        or should have default value
     */
    private static int generateId = 0;
    private final long ID;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private String address;
    private String city;
    private String country;
    private float averageGrade;
    private Gender gender;

    public Student(String name, String surname, LocalDate birthdate, String address, String city, String country, float averageGrade, Gender gender) {
        this.ID = ++generateId;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.address = address;
        this.city = city;
        this.country = country;
        this.averageGrade = averageGrade;
        this.gender = gender;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", averageGrade=" + averageGrade +
                ", gender=" + gender +
                '}';
    }
}









