package oop.intro_to_classes_and_objects.summary;

public class DogTest {
    public static void main(String[] args) {
        //EmriKlases emriVariables = new konstruktori();
        Dog dog1 = new Dog();
        dog1.setName("Lluki");
        dog1.setWeight(20);
        dog1.setFavouriteToy("top1");

        Dog dog2 = new Dog();
        dog2.setName("Llesi");
        dog2.setFavouriteToy("laptopi");
        dog2.setWeight(33);


        System.out.println(dog1.getName());


        System.out.println(dog1.compareTo(dog2));
        System.out.println(dog2.compareTo(dog1));

        Dog dog3 = new Dog("Bobi", 17F, "ball");

    }
}







