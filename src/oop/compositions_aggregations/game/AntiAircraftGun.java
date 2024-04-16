package oop.compositions_aggregations.game;

import oop.intro_to_classes_and_objects.examples.Point;

public class AntiAircraftGun {
    private int id;
    private Point point;
    private int health;
    private Bomber target;


    public AntiAircraftGun(int id, Point point, int health) {
        this.id = id;
        this.point = point;
        this.health = health;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public Bomber getTarget() {
        return target;
    }

    public void setTarget(Bomber target) {

        if (point.distanceTo(target.getPoint())<50){
            this.target = target;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(){
        if (target != null){
            int damage = (int) (Math.random()*101);
            int newHealth = target.getHealth() - damage;
            target.setHealth(newHealth);
        }
    }



}
