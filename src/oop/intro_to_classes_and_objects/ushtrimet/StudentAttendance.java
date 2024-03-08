package oop.intro_to_classes_and_objects.ushtrimet;

public class StudentAttendance {
    //variablat instance
    private int id;
    private String name;
    private String surname;
    private String email;
    private boolean attended;
    private String signature;

    // constructors
    public StudentAttendance(int id) {
        //default constructor
        setId(id);

    }

    //metodat get dhe set *getters *setters
    public int getId() {
        return id;
    }

    private void setId(int id) {
        if (id <= 0) {
            System.out.println("Nuk guxon te vendoset vlera me vogel 1!");
            return;
        }
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("Nuk guxon emri me qene blank (pa emer)!");
            return;
        }

        this.name = name;
    }


}













