package oop.interfaces.ushtrime3;

public class BarcelonaPlayer extends PlayerAdapter {
    @Override
    public boolean skip() {
        System.out.println("Skip prej titullit");
        return true;
    }

    @Override
    public void shoot() {
        System.out.println("Shuto ne gol!");
    }
}
