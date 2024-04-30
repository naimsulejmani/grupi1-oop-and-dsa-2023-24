package oop.inheritance.payrollapp;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private String lastName;
    private LocalDate birthDate;

    public Employee() {
    }

    public Employee(int id, String name, String lastName, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double pay() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "";
    }
}
