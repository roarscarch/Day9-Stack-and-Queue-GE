package org.example;

public class StackHandler {
    public static void main(String[] args) throws Exception {

        Stack<Integer> stack = new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println(stack);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
