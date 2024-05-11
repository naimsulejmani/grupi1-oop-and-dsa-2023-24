package oop.polymorphism.finalization;

public final class Pes extends Loja {
    private static final int MAX_NO;


    //static initializer block
    static {
        System.out.println("BEFORE EVERYTHING ELSE");
        MAX_NO = 100;
    }

    private final int YEAR_PUBLISHED;


//    {
//        YEAR_PUBLISHED = 2024;
//    }

    public Pes(int year) {
        YEAR_PUBLISHED = year;
    }

    public Pes(String name, int year) {
        super(name);
        YEAR_PUBLISHED = year;
        System.out.println("LAST");
    }

//    @Override
//    public String getName() {
//        return "Loja = " + super.getName();
//    }
}
