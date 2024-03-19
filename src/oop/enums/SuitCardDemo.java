package oop.enums;

public class SuitCardDemo {
    public static void main(String[] args) {

        drawSuitOnCard(10);
        drawSuitOnCard(-1000);
        drawSuitOnCard(Suit.SPADES);
        drawSuitOnCard(Suit.HEARTS);
//        drawSuitOnCard(Suit.ZEMRA);
    }

    // int suit = (-2Miliard deri ne +2Miliard)
    public static void drawSuitOnCard(int suit) {
        System.out.println("LLoji: " + suit);
    }

    public static void drawSuitOnCard(Suit suit) {
        System.out.println("Lloji: " + suit);
    }
}






