package oop.abstract_classes;

//INCOMPLETE
public abstract class Wrestler {

    public void paymentForWork(int hours) {
        System.out.println("Wrestlers will make " + hours * 3000 + "$");
    }

    public abstract void themeMusic();
    public abstract void finisher();
}
