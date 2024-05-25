package oop.interfaces;

public class MilkProduct implements Perishable {

    private boolean perished = false;


    @Override
    public void perish() {
//        int x = MAX_DAYS * 10;
        perished = true;
    }

    @Override
    public boolean isPerished() {
        return perished;
    }
}
