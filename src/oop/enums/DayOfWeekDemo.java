package oop.enums;

public class DayOfWeekDemo {
    public static void main(String[] args) {
        tellItLikeThis(DayOfWeek.MONDAY);
    }

    public static void tellItLikeThis(DayOfWeek day) {
        switch (day) {
            case MONDAY -> System.out.println("Mondays are bad!");
            case FRIDAY -> System.out.println("Fridays are better!");
            case SATURDAY, SUNDAY -> System.out.println("Weekends are best!");
            default -> System.out.println("Mid-weeks, working days are Boring!");
        }
    }
}









