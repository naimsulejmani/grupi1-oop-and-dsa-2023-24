package oop.inheritance.payrollapp;

import java.time.LocalDate;

public class Paycheck {
    private Employee employee;
    private int month;
    private int year;
    private LocalDate releaseDate;

    public Paycheck(Employee employee, int month, int year, LocalDate releaseDate) {
        this.employee = employee;
        this.month = month;
        this.year = year;
        this.releaseDate = releaseDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void print() {
        System.out.println(this);
        //System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("--------------------------------------\n");
        sb.append(String.format("Paga per periudhen %d/%d%n", month, year));
        sb.append("--------------------------------------\n");
        sb.append(employee);
        sb.append("\nLeshuar me: " + releaseDate);
        sb.append("\n--------------------------------------\n");
        return sb.toString();
    }
}
