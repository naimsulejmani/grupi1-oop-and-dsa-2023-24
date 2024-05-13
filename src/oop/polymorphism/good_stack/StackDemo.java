package oop.polymorphism.good_stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Naim");
        stack.push("Filan");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        //stack.addFirst("Test");
    }
}
