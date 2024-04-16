package oop.inheritance;

public class Student extends Person {
    private String department;

    public Student(String department) {
        this("Unknown", 0, department);
        this.department = department;
    }

    public Student(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return String.format("%s;%d;%s", name, getAge(), department);
    }
}
