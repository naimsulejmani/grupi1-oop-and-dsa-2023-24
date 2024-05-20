package oop.exceptions;

public class BreakPointFor {
    public static void main(String[] args) {
// F8 - Step Over
// F7 - Step Into
// Shift+F8 - Step Out
// F9 - Continue deri ne break pointin tjeter nese ka
// Right click on break point make conditional break point
        int i = 1;
        while (i <= 10_000) {
            System.out.println(i);
            i++;
        }
    }
}
