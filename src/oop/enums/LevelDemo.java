package oop.enums;

public class LevelDemo {
    public static void main(String[] args) {
        Level hyrjaNeProgramim = Level.HARD;
        Level oop = Level.NORMAL;

        System.out.println(hyrjaNeProgramim);
        System.out.println(oop);

        if (hyrjaNeProgramim.equals(oop)) {
            System.out.println("PO");
        } else {
            System.out.println("JO");
        }

        if (hyrjaNeProgramim != oop) {
            System.out.println("PO");
        } else {
            System.out.println("JO");
        }


        if (oop.equals(Level.NORMAL)) {

        }

        if (oop == Level.EASY) {

        }


        System.out.println(hyrjaNeProgramim.compareTo(oop));
        System.out.println(oop.compareTo(hyrjaNeProgramim));
        System.out.println(oop.compareTo(Level.EASY));
        System.out.println(oop.compareTo(Level.NORMAL));

        System.out.println(oop);

        oop = Level.valueOf("HARD");
        System.out.println(oop);


        int seasonInt = 3;

        if(seasonInt==2) {

        }

        Season s = Season.WINTER;


    }
}








