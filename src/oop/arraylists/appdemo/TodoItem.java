package oop.arraylists.appdemo;

import java.time.LocalDate;

public class TodoItem {
    private String title;
    private boolean completed;
    private LocalDate createdAt;

    public TodoItem(String title, boolean completed, LocalDate createdAt) {
        this.title = title;
        this.completed = completed;
        this.createdAt = createdAt;
    }

    public TodoItem(String title, boolean completed) {
        this(title, completed, LocalDate.now()); // thirre konstruktorin me 3 parametra , Daten e sot-it
    }

    public TodoItem(String title) {
        this(title, false); // thirre konstruktorion me dy parameta, e merr completed false, daten e sot-it
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s (%s)", createdAt, title, completed);
    }
}









