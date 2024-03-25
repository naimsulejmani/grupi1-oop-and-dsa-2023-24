package oop.enums.advanced;

public class RatingDemo {
    public static void main(String[] args) {
        Rating profaGezim = Rating.FIVE_STAR;
        Rating profaJon = Rating.FOUR_STAR;
        Rating profaNaim = Rating.ZERO_STAR;

        System.out.printf("%s -> %s %n", profaGezim.toString(), profaGezim.getValue());
        System.out.printf("%s -> %s %n", profaJon.toString(), profaJon.getValue());
        System.out.printf("%s -> %s %n", profaNaim.toString(), profaNaim.getValue());

    }
}









