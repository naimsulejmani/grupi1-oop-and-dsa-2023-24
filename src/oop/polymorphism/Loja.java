package oop.polymorphism;

public class Loja {
    private int[][] matrix = new int[3][3];


    //instance initializer block
    {
        System.out.println("FIRST");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = -1;
            }
        }
    }

    //
    public Loja() {

        System.out.println("LAST");
    }

    //instance initializer block
    {
        System.out.println("SECOND");
    }
}
