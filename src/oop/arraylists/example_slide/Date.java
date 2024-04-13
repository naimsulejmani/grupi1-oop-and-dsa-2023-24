package oop.arraylists.example_slide;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //String duhet me qene i formatit: d.m.v
    public Date(String strDate) {
        //arsyeja pse duhet \\. eshte se kur e ndane e kerkone nje regex, e pika eshte escape character
        String[] dateParts = strDate.split("\\.");

        if (dateParts.length != 3) {
            System.out.println("Invalid date format");
            this.year = this.month = this.day = 1; //1.1.1
        } else {
            this.day = Integer.parseInt(dateParts[0]);
            this.month = Integer.parseInt(dateParts[1]);
            this.year = Integer.parseInt(dateParts[2]);
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("%d.%d.%d", day, month, year);
    }
}

