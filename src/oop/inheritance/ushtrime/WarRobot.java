package oop.inheritance.ushtrime;

public class WarRobot extends Roboti {
    private String gun;

//    public WarRobot() {
//        super(null, null);
//    }

    public WarRobot(String name, String processor, String gun, int age) {
        super(name, processor);
        this.gun = gun;
        super.age = age;
    }

}
