package Baitap.DSA_Stack_Queue.ThapPhan_NhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {

    public static String decimalToBinary(int decimal) {

        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            int num = decimal % 2;
            stack.push(num);
            decimal = decimal / 2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thập phân muốn chuyển đổi:");
        int decimal = sc.nextInt();
        System.out.println("Số nhị phân: " +decimalToBinary(decimal));
    }
}
