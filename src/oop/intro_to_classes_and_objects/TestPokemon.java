package oop.intro_to_classes_and_objects;

public class TestPokemon {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        pikachu.name = "Pikachu";
        pikachu.type = "electric";
        pikachu.health = 100;

        Pokemon oltinjo = new Pokemon();
        oltinjo.name = "Barcelona";
        oltinjo.type = "lossers";
        oltinjo.health = 1;


        pikachu.attack(oltinjo);
        pikachu.attack(oltinjo);
        pikachu.attack(oltinjo);

        System.out.println("Shneta e oltinjoes " + oltinjo.health);
    }
}







