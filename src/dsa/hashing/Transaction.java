package dsa.hashing;

import java.time.LocalDate;

public class Transaction {
    private final String who;
    private final LocalDate when;
    private final double amount;

    public Transaction(String who, LocalDate when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public String getWho() {
        return who;
    }

    public LocalDate getWhen() {
        return when;
    }

    public double getAmount() {
        return amount;
    }


    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 17; // PRIMITIVE
        hash = 31 * hash + who.hashCode();
        hash = 31 * hash + when.hashCode();
        hash = 31 * hash + Double.valueOf(amount).hashCode();

        return hash;//(hash & 0x7FFFFFFF) % 100;
    }
}
