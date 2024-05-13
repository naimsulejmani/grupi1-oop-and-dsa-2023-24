package oop.polymorphism.bad_example;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Naim", "Sulejmani");
        Student student = new Student(person, "Programming");

        //Person p = new Student()

        System.out.println(student.getPerson().getName());
    }
}
