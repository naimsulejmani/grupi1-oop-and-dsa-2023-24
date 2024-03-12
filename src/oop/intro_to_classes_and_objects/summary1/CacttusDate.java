package oop.intro_to_classes_and_objects.summary1;

public class CacttusDate {
    private int year = 1970;
    private int month = 1;
    private int day = 1;

    public CacttusDate() {
    }

    public CacttusDate(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 0) {
            System.out.println("Nuk guxon viti te jete me i vogel se 1");
            return;
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12)
            this.month = month;
        else
            System.out.println("Muaji jasht rangut 1..12!");
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (day >= 1 && day <= 31) {
                    this.day = day;
                } else {
                    System.out.println("Dita eshte jasht rangut 1..31!");
                }
                break;
            case 2:
                boolean leapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
                int maxDays = leapYear ? 29 : 28;
                if (day >= 1 && day <= maxDays) {
                    this.day = day;
                } else {
                    System.out.printf("Dita eshe jasht rangut %d..%d!", 1, maxDays);
                }
                break;
            default:
                if (day >= 1 && day <= 30) {
                    this.day = day;
                } else {
                    System.out.println("Dita eshte jasht rangut 1..30!");
                }
        }

    }

    public void printDate() {
        System.out.printf("%d.%d.%d%n", day, month, year);
    }
}








