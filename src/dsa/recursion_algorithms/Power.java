package dsa.recursion_algorithms;

public class Power {

    private static int power(int baza, int eksponenti) {
        if (eksponenti < 1) return 1;
        return baza * power(baza, eksponenti - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 8));
    }
}
