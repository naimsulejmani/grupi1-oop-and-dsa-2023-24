package oop.intro_to_classes_and_objects;

public class Pokemon {
    String name;
    String type;
    int health;


    boolean dodge() {
        return Math.random() > 0.5;
    }

    void attack(Pokemon enemy) {
        if (!enemy.dodge()) {
            enemy.health--;
        }
    }
}















