package Baitap.ArrayAndMethod;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập size của mảng:");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng ");
            arr[i] = input.nextInt();
        }

        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if ( min > arr[j]) {
                min = arr[j];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
    }
}
