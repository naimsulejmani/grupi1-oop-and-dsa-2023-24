package oop.intro_to_classes_and_objects.summary;

public class Dog {
    //variablat instance
    private String name;
    private float weight;
    private String favouriteToy;

    //constructors
    //default constructor
    public Dog() {

    }

    public Dog(String name, float weight, String favouriteToy) {
        setName(name);
        setWeight(weight);
        setFavouriteToy(favouriteToy);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight <= 0 || weight > 100) {
            System.out.println("Asnje qen ne bote ska peshe negative ose mbi 100");
            return;
        }
        this.weight = weight;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

    public int compareTo(Dog anotherDog) {
        if (this.weight < anotherDog.weight)
            return -1;
        else if (this.weight > anotherDog.weight)
            return 1;
        else return 0;
    }
}
















