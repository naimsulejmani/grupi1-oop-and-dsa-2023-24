package oop.inheritance.payrollapp;

import java.time.LocalDate;

public class Consultant extends HourlyEmployee {
    public Consultant() {
    }

    public Consultant(int id, String name, String lastName, LocalDate birthDate, double hourlyWage, double hours) {
        super(id, name, lastName, birthDate, hourlyWage, hours);
    }

    @Override
    public String toString() {
        return String.format("%s%nPozita: Consultant", super.toString());
    }
}
