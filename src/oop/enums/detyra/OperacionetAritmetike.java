package oop.enums.detyra;

public enum OperacionetAritmetike {
    PLUS('+'),
    MINUS('-'),
    SHUMEZIM('*'),
    PJESTIM('/'),
    MODULUS('%');

    private final char shenja;

    OperacionetAritmetike(char shenja) {
        this.shenja = shenja;
    }

    public char getShenja() {
        return shenja;
    }

    public void print() {
        System.out.printf("%s ka shenjene %c%n", this, this.getShenja());
    }

}












