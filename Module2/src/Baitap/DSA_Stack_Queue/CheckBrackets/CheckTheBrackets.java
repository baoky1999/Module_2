package Baitap.DSA_Stack_Queue.CheckBrackets;

import java.util.Stack;

public class CheckTheBrackets {

    public static boolean checkBrackets(String input) {
        Stack<Character> stack = new Stack<>();
        char left;
        for (char symbol:input.toCharArray()) {
            if (symbol == '(') {
                stack.push(symbol);
            } else if (symbol == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                left = stack.pop();
                if (left != '(') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        System.out.println(CheckTheBrackets.checkBrackets(input));
    }
}
