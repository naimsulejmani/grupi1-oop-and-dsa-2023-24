package oop.inheritance.payrollapp;

import java.time.LocalDate;

public class Programmer extends SalariedEmployee {
    private String programmingLanguages;

    public Programmer() {
    }

    public Programmer(int id, String name, String lastName, LocalDate birthDate, double salary, String programmingLanguages) {
        super(id, name, lastName, birthDate, salary);
        this.programmingLanguages = programmingLanguages;
    }

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public String toString() {
        return "";
    }
}
