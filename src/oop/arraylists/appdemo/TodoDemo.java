package oop.arraylists.appdemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TodoDemo {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<TodoItem> todos = new ArrayList<>();

        showMenu();


        int choice = Integer.parseInt(reader.nextLine());
        ToDoMenu selectedMenu = ToDoMenu.values()[choice];

        while (selectedMenu != ToDoMenu.EXIT) {
            switch (selectedMenu) {
                case CREATE -> createTodo(todos);
                case UPDATE -> updateTodo(todos);
                case DELETE -> deleteTodo(todos);
                case READ_ONE -> readOneTodo(todos);
                case READ_ALL -> readAllTodo(todos);
                case CLEAR -> clearAlLTodo(todos);
            }
            showMenu();
            choice = Integer.parseInt(reader.nextLine());
            ;
            selectedMenu = ToDoMenu.values()[choice];
        }
        System.out.println("Aplikacioni u mbyll! Faleminderit!");

    }

    private static void clearAlLTodo(ArrayList<TodoItem> todos) {

    }

    private static void readAllTodo(ArrayList<TodoItem> todos) {
        int index = 0;
        System.out.println("Lista me todo: ");
        System.out.println("-----------------------------");
        for (TodoItem item : todos) {
            System.out.printf("#%d - %s %n", index, item);
            index++;
        }
        System.out.println("-----------------------------");
    }

    private static void readOneTodo(ArrayList<TodoItem> todos) {

    }

    private static void deleteTodo(ArrayList<TodoItem> todos) {
    }

    private static void updateTodo(ArrayList<TodoItem> todos) {

    }

    private static void createTodo(ArrayList<TodoItem> todos) {
        System.out.println("Shkruaj todon: ");
        String title = reader.nextLine();
        TodoItem todo = new TodoItem(title);
        todos.add(todo);
    }

    private static void showMenu() {
        System.out.println("Zgjedh njeren nga opsionet e meposhtme per todo: ");
        System.out.println("---------------------------------------");
        int index = 0;
        for (ToDoMenu menu : ToDoMenu.values()) {
            System.out.printf("%d - %s%n", index, menu);
            index++;
        }
        System.out.println("---------------------------------------");
    }

}
