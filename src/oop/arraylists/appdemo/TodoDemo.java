package oop.arraylists.appdemo;

import java.time.LocalDate;

public class TodoDemo {
    public static void main(String[] args) {
        TodoItem todo1 = new TodoItem("Ligjerata e DSA");
        TodoItem todo2 = new TodoItem("Ligjerata e OOP", true);
        TodoItem todo3 = new TodoItem("Shkuarja per Bajram",false, LocalDate.of(2024,4,9));

        System.out.println(todo1.toString());
        System.out.println(todo2);
        System.out.println(todo3);
    }
}
