package Baitap.DSA_Stack_Queue.Palindrome_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        String inputString = input.toLowerCase();
        for (char a: inputString.toCharArray()) {
            stack.push(a);
            queue.offer(a);
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals( queue.poll())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Able was I ere I saw elba";
        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Không phải palindrome");
        }
    }
}
