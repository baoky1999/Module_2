package Baitap.DSA_Stack_Queue.ReverseStack;

import java.util.Stack;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int j = 0; j < arr.length; j++) {
            arr[j] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
