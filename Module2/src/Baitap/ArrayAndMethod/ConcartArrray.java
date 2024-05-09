package Baitap.ArrayAndMethod;

import java.util.Scanner;

public class ConcartArrray {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] number = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " của mảng 1");
             array[i] = input.nextInt();
        }
        for (int j = 0; j < number.length; j++) {
            System.out.println("Nhập phần tử thứ " + (j + 1) + " của mảng 2");
            number[j] = input.nextInt();
        }

        int[] count = new int[10];

        for (int i = 0; i < array.length; i++) {
            count[i] = array[i];
        }
        for (int j = 0; j < number.length; j++) {
            count[j + array.length] = number[j];
        }
        for (int x:count) {
            System.out.print(x + " ");
        }
    }
}
