package oop.intro_to_classes_and_objects;

public class Person {
    private long personalNo;
    private String name;
    private String surname;
    private String favoriteSportTeam;
    private int age;

    public long getPersonalNo() {
        return personalNo;
    }

    public void setPersonalNo(long p) {
        if (p > 0)
            personalNo = p;
        else
            System.out.println("Nuk lejohet vlere negative!");
    }

}














