package Baitap.DSA_Stack_Queue.ReverseStack;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String input = "Hello everyone";
        String reverse = reverseString(input);
        System.out.println(reverse);
    }
}
