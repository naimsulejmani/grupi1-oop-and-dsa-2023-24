package dsa.recursion_algorithms;

public class TowersOfHanoi {

    static void towersOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {

        if (n == 1) {
            System.out.printf("Move disk 1 from rod %c to rod %c.%n", from_rod, to_rod);
            return;
        }

        towersOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.printf("Move disk %d from rod %c to rod %c.%n", n, from_rod, to_rod);
        towersOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String[] args) {
        towersOfHanoi(5, 'A','C', 'B');
    }
}
