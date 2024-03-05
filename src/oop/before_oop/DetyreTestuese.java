package oop.before_oop;

import java.util.Scanner;

public class DetyreTestuese {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Numri: ");
        long numri = reader.nextLong();

        long shuma = 0;

//        while (numri > 0) {
////            numri /= 10;
////            long numriNePozitatCift = numri % 10;
////            shuma += numriNePozitatCift % 2 == 0 ? numriNePozitatCift : 0L;
////            numri /= 10;
//            long numriNePozitatCift = (numri % 100) / 10;
//            shuma += numriNePozitatCift % 2 == 0 ? numriNePozitatCift : 0L;
//            numri /= 100;
//
//        }
//        System.out.println("Shuma = " + shuma);

        String strNumri = String.valueOf(numri); // value + "";

        for (int i = strNumri.length() - 2; i >= 0; i -= 2) {
            int vlera = Integer.parseInt(strNumri.charAt(i) + "");
            if (vlera % 2 == 0)
                shuma += vlera;
        }

        System.out.println("Shuma = " + shuma);


    }
}










