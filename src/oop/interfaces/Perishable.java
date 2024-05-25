package oop.interfaces;

import java.time.Period;

public interface Perishable {
    //constants
    int MAX_DAYS = 5; //public static final
    public static final Period MAX_PERIOD = Period.ofDays(MAX_DAYS);

    //abstract methods
    void perish();

    boolean isPerished();

    //default methods
    public default boolean verifyPeriod(Period period) {
        return comparePeriod(period) < 0;
    }

    //private methods
    private int comparePeriod(Period period) {
        return period.getDays() - MAX_PERIOD.getDays();
    }

    //static methods
    public static int getMaxPeriodDays() {
        return MAX_PERIOD.getDays();
    }


}
