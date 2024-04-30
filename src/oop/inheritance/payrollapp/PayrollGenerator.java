package oop.inheritance.payrollapp;

import java.time.LocalDate;

public class PayrollGenerator {
    public static void main(String[] args) {
        Employee emp1 = new Programmer(1, "Olti", "Januzi",
                LocalDate.of(2004, 7, 7), 400,
                "Java, JavaScript, Python");

        Employee emp2 = new Manager(2, "Sara", "Kutleshi",
                LocalDate.of(2005, 5, 5),
                500, 0.15f);

        Paycheck paycheck1 = new Paycheck(emp1, 3, 2024, LocalDate.now());
        paycheck1.print();

        Paycheck paycheck2 = new Paycheck(emp2, 4, 2024, LocalDate.now());
        paycheck2.print();
    }
}
