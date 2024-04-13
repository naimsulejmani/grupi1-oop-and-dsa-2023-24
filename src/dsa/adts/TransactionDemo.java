package dsa.adts;

import java.time.LocalDate;

public class TransactionDemo {
    public static void main(String[] args) {
        Transaction transaction = new Transaction("Olti Januzi", LocalDate.now(), 300);
        Transaction transaction1 = new Transaction(
                "Agon Krasniqi", LocalDate.of(2024, 1, 1), 1250);

        Transaction transaction2 = new Transaction("Zana ADT-ja;2024-04-08;2000");

        System.out.println(transaction);
        System.out.println(transaction1);
        System.out.println(transaction2);
    }
}
