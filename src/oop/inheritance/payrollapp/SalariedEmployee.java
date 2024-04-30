package oop.inheritance.payrollapp;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(int id, String name, String lastName, LocalDate birthDate, double salary) {
        super(id, name, lastName, birthDate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public double pay() {
        return salary;
    }

    @Override
    public String toString() {
        return "";
    }
}
