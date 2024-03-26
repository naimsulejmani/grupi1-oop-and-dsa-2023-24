package oop.enums.detyra;

public enum MeassuringUnitInByte {
    BYTE(8),
    KILO_BYTE(BYTE.getBits() * 1024),
    MEGA_BYTE(KILO_BYTE.getBits() * 1024),
    GIGA_BYTE(MEGA_BYTE.getBits() * 1024),
    TERA_BYTE(GIGA_BYTE.getBits() * 1024);


    private final long bits;

    private MeassuringUnitInByte(long bits) {
        this.bits = bits;
    }

    public long getBits() {
        return bits;
    }
    public long getBytes(){
        return bits/ BYTE.bits;
    }
}















