package oop.polymorphism.bad_stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Naim");
        stack.push("Filan");
        stack.addFirst("Test");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
