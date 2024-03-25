package oop.enums.advanced;

public class SeasonDemo {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + " -> " + season.getValue());
        }
    }
}
