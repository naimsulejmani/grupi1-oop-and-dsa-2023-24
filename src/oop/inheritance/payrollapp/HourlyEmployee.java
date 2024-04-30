package oop.inheritance.payrollapp;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double hours;
    private double hourlyWage;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int id, String name, String lastName, LocalDate birthDate, double hourlyWage, double hours) {
        super(id, name, lastName, birthDate);
        this.hourlyWage = hourlyWage;
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }


    @Override
    public double pay() {
        return hourlyWage * hours;
    }

    @Override
    public String toString() {
        return "";
    }
}










