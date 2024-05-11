package oop.polymorphism.finalization;

public class Loja {
    private String name;

    public Loja() {
    }

    public Loja(final String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    /***
     *
     * @param name is final variable of String type
     */
    public void setName(final String name) {
//        name += name + "A";
        this.name = name;
    }
}
