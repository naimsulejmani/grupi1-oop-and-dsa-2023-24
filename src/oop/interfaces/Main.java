package oop.interfaces;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Player player1 = new BasketballPlayer();
        Player player2 = new FutballPlayer();
//        System.out.println(Player.x);

        LocalDate dt1 = LocalDate.of(2022,1,30);
        LocalDate dt2 =LocalDate.of(2022,2,1);

        Period period = Period.between(dt1, dt2);

        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
    }
}
