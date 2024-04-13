package dsa.adts;

import java.time.LocalDate;

public class Transaction implements Comparable<Transaction> {

    private String who;
    private LocalDate when;
    private double amount;

    public Transaction(String who, LocalDate when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public Transaction(String transaction) {
        // Naim Sulejmani;2020-04-04;300
        String[] tokens = transaction.split(";");
        if (tokens.length != 3) {
            System.out.println("Nuk keni dhene specifikim te duhur sipas rregulles: who;when;amount");
            return;
        }
        this.who = tokens[0];
        this.when = LocalDate.parse(tokens[1]);
        this.amount = Double.parseDouble(tokens[2]);
    }

    public String who() {
        return who;
    }

    public LocalDate when() {
        return when;
    }

    public double amount() {
        return amount;
    }

    @Override
    public int compareTo(Transaction o) {
        return 0;
    }

    @Override
    public String toString() {
        // Naim Sulejmani;2020-04-04;300
        return String.format("%s;%s;%s", who, when, amount);
    }
}
