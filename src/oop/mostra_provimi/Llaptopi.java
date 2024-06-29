package oop.mostra_provimi;

public class Llaptopi {
    private String llojiLlaptopit;
    private short ramSlot1;
    private short ramSlot2;
    private int storage;
    private float inches;

    public Llaptopi(String llojiLlaptopit, short ramSlot1, short ramSlot2, int storage, float inches) {
        this.llojiLlaptopit = llojiLlaptopit;
        setRamSlot1(ramSlot1);
        setRamSlot2(ramSlot2);
        setStorage(storage);
        this.inches = inches;
    }

    public Llaptopi() {
    }

    public String getLlojiLlaptopit() {
        return llojiLlaptopit;
    }

    public void setLlojiLlaptopit(String llojiLlaptopit) {
        this.llojiLlaptopit = llojiLlaptopit;
    }

    public short getRamSlot1() {
        return ramSlot1;
    }

    public void setRamSlot1(short ramSlot1) {
        if (ramSlot1 == 1 || ramSlot1 == 2 || ramSlot1 == 4 || ramSlot1 == 8) {
            this.ramSlot1 = ramSlot1;
        } else {
            throw new IllegalArgumentException("Ram slot must be 1 or 2");
        }
    }

    public short getRamSlot2() {
        return ramSlot2;
    }

    public void setRamSlot2(short ramSlot2) {
        if (ramSlot2 == 1 || ramSlot2 == 2 || ramSlot2 == 4 || ramSlot2 == 8) {
            this.ramSlot2 = ramSlot2;
        } else {
            throw new IllegalArgumentException("Ram slot must be 1 or 2");
        }
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        if (storage > 0)
            this.storage = storage;
        else {
            throw new IllegalArgumentException("Storage must be greater than 0");
        }
    }

    public void setStorage(float storage) {
        setStorage((int)storage);
    }


    public float getInches() {
        return inches;
    }

    public void setInches(float inches) {
        this.inches = inches;
    }


    public static void main(String[] args) {
        Llaptopi l1 = new Llaptopi("Ryzen", (short) 8, (short) 8, 256, 14.1F);

        l1.setInches(15.6f);
        l1.setStorage(512);
        l1.setRamSlot1((short)8);




        System.out.println(l1.getInches());
        System.out.println(l1.getLlojiLlaptopit());
        System.out.println(l1.getStorage());
    }
}
