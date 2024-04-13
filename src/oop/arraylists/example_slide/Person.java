package oop.arraylists.example_slide;

public class Person {
    private String name;
    private Date birthdate;

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public Person(String name) {
        this(name, new Date(1, 1, 1));
    }

    public Person(String name, String strBirthdate) {
        this(name, new Date(strBirthdate));
    }

    public Person(String name, int year, int month, int day) {
        this(name, new Date(year, month, day));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return String.format("%s,%d,%d,%d", name,
                birthdate.getYear(), birthdate.getMonth(), birthdate.getDay());
    }
}
