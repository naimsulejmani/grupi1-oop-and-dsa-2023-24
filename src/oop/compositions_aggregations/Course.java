package oop.compositions_aggregations;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {
    private String id;
    private String name;
    private String description;
    private static final int MAX_STUDENTS = 100;
    //    private int numStudents = 0;
    //    private Student[] students = new Student[MAX_STUDENTS];
    private ArrayList<Student> students = new ArrayList<>(MAX_STUDENTS);

    public Course(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumStudents() {
//        return numStudents;
        return students.size();
    }

//    public void setNumStudents(int numStudents) {
//        this.numStudents = numStudents;
//    }

//    public Student[] getStudents() {
//        return students;
//    }
//
//    public void setStudents(Student[] students) {
//        this.students = students;
//    }


    public void enrollStudent(Student student) {
        if (getNumStudents() < MAX_STUDENTS) {
//            students[numStudents++] = student;
            students.add(student);
        } else {
            System.out.println("Nuk ka vende te lira!? Tash o vone!?");
        }
    }


    @Override
    public String toString() {
        //StringBuilder
        StringBuilder sb = new StringBuilder("");
        sb.append("ID: " + getId() + "\n");
        sb.append("Name: " + getName() + "\n");
        sb.append("Description: " + getDescription() + "\n");
        sb.append("------------------------------------------------\n");
        for (Student student : students) {
            sb.append(student.toString() + "\n");
        }
        sb.append("------------------------------------------------\n");

        return sb.toString();
//        return "Course{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
////                ", numStudents=" + numStudents +
//                ", students=" + students +
//                '}';
    }
}
