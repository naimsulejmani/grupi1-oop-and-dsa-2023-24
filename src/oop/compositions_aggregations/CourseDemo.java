package oop.compositions_aggregations;

import java.time.LocalDate;

public class CourseDemo {
    public static void main(String[] args) {
        Course oop = new Course("OOP",
                "Programimi i orientuar ne objekte",
                "OOP mirret me kthy gjithcka ne kompjuterike ne boten virtuale");

        Course mtm = new Course("MTM", "Matematika Kompjuterike",
                "Statistike, etj");

        Student studOlti = new Student(
                "Olti", "Januzi", LocalDate.of(2004, 1, 1),
                "se di", "Gjakove", "Kosove",
                4.7F, Gender.MALE);

        Student studSara = new Student("Sara", "Kutleshi", LocalDate.of(2005, 5, 5),
                "se di", "Podujeve", "Kosove", 4.5F, Gender.FEMALE);

        Student studAgoni = new Student("Agon", "Krasniqi", LocalDate.of(1997, 5, 5),
                "se di", "Podujeve", "Kosove", 4.75F, Gender.MALE);


        oop.enrollStudent(studOlti);
        mtm.enrollStudent(studSara);
        oop.enrollStudent(studAgoni);


        System.out.println(oop);

        System.out.println(mtm);

    }
}
