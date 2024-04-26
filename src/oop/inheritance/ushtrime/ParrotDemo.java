package oop.inheritance.ushtrime;

public class ParrotDemo {
    public static void main(String[] args) {
        TakingParrot realParrot = new TakingParrot("Barcelonist",
                "zi", "humbje",
                new String[]{"a kuku reali", "humbasim",
                        "apet Reali a!?"});

        System.out.println(realParrot.saySomething());
        System.out.println(realParrot);

    }
}
