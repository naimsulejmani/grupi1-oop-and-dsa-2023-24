package oop.polymorphism.ushtrime;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape sh1 = new Circle(2.3);
        Shape sh2 = new Square(5);

        Shape sh3 = new Shape();

        System.out.println(sh1.area());
        System.out.println(sh1.perimeter());
        System.out.println(sh2.perimeter());
        System.out.println(sh2.area());

        double x = Math.min(10.4, 20.3);

        checkShape(sh1);
    }

    //upcasting kur objektin e femise mundemi me ruajt te prindi
    private static void checkShape(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("Ti je nje rreth");
        }

        if(shape instanceof Square) {
            System.out.println("Ti je nje katrore");
        }

        if(shape instanceof Shape) {
            System.out.println("Une jam nje SHAPE");
        }

        if(shape instanceof Object) {
            System.out.println("Une jam nje OBJECT");
        }
    }
}
