package oop.inheritance.payrollapp;

import java.time.LocalDate;

public class Secretary extends HourlyEmployee {
    public Secretary() {
    }

    public Secretary(int id, String name, String lastName, LocalDate birthDate, double hourlyWage, double hours) {
        super(id, name, lastName, birthDate, hourlyWage, hours);
    }

    @Override
    public String toString() {
        return String.format("%s%nPozita: Secretary", super.toString());
    }
}
