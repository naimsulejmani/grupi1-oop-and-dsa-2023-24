package oop.interfaces.ushtrime2;

public class Demo {
    public static void main(String[] args) {
        Z z = new Z();
        z.a(); // metode e interface-it
        z.b();
        System.out.println(z.toString()); // metode e klases Object

        if(z instanceof Y) {
            Y y = z; //upcasting
            y.a();
            //y.b();// prindi nuk e din se femija e ka nje metode b
            System.out.println(z.toString());
        }
    }
}
