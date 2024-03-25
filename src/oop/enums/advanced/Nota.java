package oop.enums.advanced;

public enum Nota {
    DOBET(1),
    MJAFTUESHEM(2),
    MIRE(3),
    SHUME_MIRE(4),
    SHKELQYESHEM(5);

    private final int value;

    Nota(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}














