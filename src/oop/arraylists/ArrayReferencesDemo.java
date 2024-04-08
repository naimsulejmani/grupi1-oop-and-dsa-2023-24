package oop.arraylists;

import oop.intro_to_classes_and_objects.examples.Point;

import java.util.Arrays;

public class ArrayReferencesDemo {
    public static void main(String[] args) {
        //reference i vargut me referenca te string-it
        String[] names = {"Test", "Workshop"};

        //reference e objektit te klases Point
        Point point = new Point(10, 20);

        Point[] points = {point, new Point(1, 1), new Point(2, 2)};


        String[] teams; // declaration
        // teams = {"Real Madrid", "Barcelona"}; // inicialzimin bad
        teams = new String[]{"Real Madrid", "LoserLona", "LoserPool", "A","D","B"};

        Arrays.sort(teams);
        System.out.println(Arrays.toString(teams));

        int index = Arrays.binarySearch(teams, "Real Madrid");
        System.out.println(index);
        System.out.println(teams[index]);
    }
}












