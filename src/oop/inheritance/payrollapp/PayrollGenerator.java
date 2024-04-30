package oop.inheritance.payrollapp;

import java.time.LocalDate;
import java.util.ArrayList;

public class PayrollGenerator {
    public static void main(String[] args) {
        String fileText = """
                1;Naim;Sulejmani;1986-12-16;Programmer;500;C#,Java,JavaScript,GoLang,C,C++,Python
                2;Sara;Kutleshi;2005-05-25;Manager;600;25;
                3;Partin;Nallbani;2004-12-01;Consultant;200;50
                4;Olti;Jonuzi;2003-11-01;Secretary;100;10
                5;Rinesa;Sedikushi;2006-01-11;Intern,150
                """;

        String[] rows = fileText.split("\n");
        ArrayList<Employee> employees = new ArrayList<>();

        for (String row : rows) {
            String[] attrs = row.split(";");
            int id = Integer.parseInt(attrs[0]);
            String name = attrs[1];
            String lastName = attrs[2];
            LocalDate birthDate = LocalDate.parse(attrs[3]);
            String position = attrs[4];

            Employee employee = null;
            if (position.equalsIgnoreCase("Programmer")) {
                double salary = Double.parseDouble(attrs[5]);
                String programmingLanguages = attrs[6];
                employee = new Programmer(id, name, lastName, birthDate, salary, programmingLanguages);
            } else if (position.equalsIgnoreCase("Manager")) {
                double salary = Double.parseDouble(attrs[5]);
                float bonusPercentage = Float.parseFloat(attrs[6]) / 100;
                employee = new Manager(id, name, lastName, birthDate, salary, bonusPercentage);
            } else if (position.equalsIgnoreCase("Secretary")) {
                double hours = Double.parseDouble(attrs[5]);
                double hourlyWage = Double.parseDouble(attrs[6]);
                employee = new Secretary(id, name, lastName, birthDate, hours, hourlyWage);
            } else if (position.equalsIgnoreCase("Consultant")) {
                double hours = Double.parseDouble(attrs[5]);
                double hourlyWage = Double.parseDouble(attrs[6]);
                employee = new Consultant(id, name, lastName, birthDate, hours, hourlyWage);
            } else {
                System.out.println("Nuk ka pozite valide!");
                continue;
            }

            employees.add(employee);
        }

        generatePayroll(employees, 4, 2024);

    }

    private static void generatePayroll(ArrayList<Employee> employees, int month, int year) {
        for (Employee employee : employees) {
            new Paycheck(employee, month, year, LocalDate.now()).print();
        }
        System.out.println("\n\n");
    }
}









