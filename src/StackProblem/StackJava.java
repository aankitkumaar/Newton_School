package StackProblem;

import java.util.Stack;

public class StackJava {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("india");
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
    }
}
