package oop.inheritance.payrollapp;


import java.time.LocalDate;

public class Manager extends SalariedEmployee {

    private float bonusPercentage;


    public Manager() {
    }

    public Manager(int id, String name, String lastName, LocalDate birthDate, double salary, float bonusPercentage) {
        super(id, name, lastName, birthDate, salary);
        this.bonusPercentage = bonusPercentage;
    }

    public float getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double pay() {
        return getSalary() + getSalary() * bonusPercentage;
    }

    @Override
    public String toString() {
        return String.format("%s%nBonusi: %.2f%nTotali per pagese: %.2f EUR%n Pozita: Menaxher",
                super.toString(), bonusPercentage * 100, pay());
    }
}













