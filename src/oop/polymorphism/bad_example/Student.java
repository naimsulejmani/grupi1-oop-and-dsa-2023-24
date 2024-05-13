package oop.polymorphism.bad_example;

public class Student {
    private Person person;
    private String department;

    public Student(Person person, String department) {
        this.person = person;
        this.department = department;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
