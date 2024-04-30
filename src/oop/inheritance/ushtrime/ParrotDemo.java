package oop.inheritance.ushtrime;

import java.util.ArrayList;
import java.util.LinkedList;

public class ParrotDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        TakingParrot realParrot = new TakingParrot("Barcelonist",
                "zi", "humbje",
                new String[]{"a kuku reali", "humbasim",
                        "apet Reali a!?"});

        System.out.println(realParrot.saySomething());
        System.out.println(realParrot);

        ArrayList<Bird> kafazi = new ArrayList<>();
        Bird[] kafazi1 = new Bird[1000];
        LinkedList<Bird> kafazi2 = new LinkedList<>();

        kafazi.add(new Bird("Pula", "white", "skraja", "hec"));
        kafazi.add(new TakingParrot("Parcelona", "pink", "humbje",
                new String[]{"humbje", "reali ma i forti"}));

        WalkingBird walkingBird = new WalkingBird("pula", "yellow", "per pak prej evertonit");
        Bird aBird = new WalkingBird("guns","red","ka humb prej aston villes");


        Bird aBird1 = (Bird) Class.forName("WalkingBird").newInstance();

    }
}














