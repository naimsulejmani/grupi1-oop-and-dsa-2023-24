package oop.enums.detyra;

public class EnumDemo {
    public static void main(String[] args) {
        MeassuringUnitInByte m1 = MeassuringUnitInByte.TERA_BYTE;
        System.out.println(m1.getBits());
        System.out.println(m1.getBytes());
        OperacionetAritmetike shenja = OperacionetAritmetike.PLUS;
//        System.out.println(shenja.getShenja());
//        System.out.println(shenja);

        shenja.print();
    }
}













