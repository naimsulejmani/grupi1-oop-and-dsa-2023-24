package oop.compositions_aggregations.game;

import oop.intro_to_classes_and_objects.examples.Point;

public class GameDemo {
    public static void main(String[] args) {
        Bomber b1 = new Bomber(1,new Point(2,1),100);
        AntiAircraftGun a1 = new AntiAircraftGun(1,new Point(1,2),100);

        b1.setTarget(a1);
        System.out.println(b1.getTarget());
        b1.attack();
        System.out.println(a1.getHealth());
        a1.setTarget(b1);
        a1.attack();
        System.out.println(b1.getHealth());

    }
}
