package oop.inheritance.ushtrime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TakingParrot extends Parrot {
    private ArrayList<String> words;

    public TakingParrot(String call, String color, String food, ArrayList<String> words) {
        super(call, color, food);
        this.words = words;
    }

    public TakingParrot(String call, String color, String food, String[] words) {
        super(call, color, food);
        this.words = new ArrayList<>();
        this.words.addAll(Arrays.asList(words));
    }

    public void addWord(String word) {
        this.words.add(word);
    }

    public String saySomething() {
        if (words.isEmpty()) {
            return "";
        }
        return words.get((int) (Math.random() * words.size()));
    }

    @Override
    public String toString() {
        return "TakingParrot{" +
                "words=" + words +
                "parent=" + super.toString() +
                '}';
    }
}
