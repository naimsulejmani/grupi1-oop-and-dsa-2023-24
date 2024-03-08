package oop.intro_to_classes_and_objects.ushtrimet;

public class StudentAttendanceTest {
    public static void main(String[] args) {
        StudentAttendance sa = new StudentAttendance(-1);
        System.out.println(sa.getId());
        System.out.println(sa.getName());
//        sa.setId(1);
        sa.setName("Naim");
        System.out.println(sa.getId());
        System.out.println(sa.getName());
//        sa.setId(-100);
        sa.setName("                        ");
        System.out.println(sa.getId());
        System.out.println(sa.getName());
    }
}















