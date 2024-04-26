package oop.inheritance;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Naim", 37, "ZHWM");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getDepartment());
        System.out.println(s1);

        Person person = new Person("Lorik", 21);
        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getAge());
//        System.out.println(person.getDepartament());
    }
}
